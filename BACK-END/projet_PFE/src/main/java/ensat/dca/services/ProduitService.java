package ensat.dca.services;


import ensat.dca.entites.Produit;
import ensat.dca.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {


    @Autowired
    private ProduitRepository produitRepository;


    public List<Produit> getLesProduits() {
        return produitRepository.findAll();
    }

    public Optional<Produit> getProduit(Long id) {
        return produitRepository.findById(id);
    }

    public void addProduit(Produit produit){
        produitRepository.save(produit);
    }

    public void updateProduit(Produit produit) {
        produitRepository.save(produit);
    }
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);

    }

}
