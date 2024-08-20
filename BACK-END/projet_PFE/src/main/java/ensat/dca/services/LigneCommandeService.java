package ensat.dca.services;

import ensat.dca.entites.Client;
import ensat.dca.entites.LigneCommande;
import ensat.dca.entites.Produit;
import ensat.dca.repositories.LigneCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LigneCommandeService {

    @Autowired
    private LigneCommandeRepository ligneCommandeRepository;

    public List<LigneCommande> getOrderProductFullList(){ return ligneCommandeRepository.findAll();}

    public List<Produit> GetProductsByOrderId( long id ){
        List<LigneCommande> orderProducts = ligneCommandeRepository.findByCommandeId(id);
        List<Produit> products = orderProducts.stream()
                .map(orderProduct -> orderProduct.getProduit())
                .collect(Collectors.toList());//
        return products;
    }
    public void calculateTotalPrice(LigneCommande ligneCommande) {
        int quantity = (int) ligneCommande.getQuantite();
        double productPrice = ligneCommande.getProduit().getPrix();
        double totalPrice = quantity * productPrice;
        ligneCommande.setTotalPrice(totalPrice);
    }
    public void createLigneCommande(LigneCommande ligneCommande){
        ligneCommandeRepository.save(ligneCommande);
    }

    public int countProduct(Long id){
        return GetProductsByOrderId(id).size();
    }

}
