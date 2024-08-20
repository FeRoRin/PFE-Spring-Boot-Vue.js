package ensat.dca.services;

import org.springframework.stereotype.Service;
import ensat.dca.entites.*;
import ensat.dca.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;


    public List<Commande> getLesCommandes() {
        return commandeRepository.findAll();
    }

    public Optional<Commande> getCommande(Long id) {
        return commandeRepository.findById(id);
    }

    public void addCommande(Commande commande){
        commandeRepository.save(commande);
    }
    public Commande addNewCommande(Commande commande){
        return commandeRepository.save(commande);
    }
    public void updateCommande(Commande commande) {
        commandeRepository.save(commande);
    }
    public void deleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }


    /* public void addProduitToCommande(Long id,Produit produit)
    {
        Commande order= commandeRepository.findById(id).orElse(null);
        if(order!=null)
        {
            LigneCommande LCommand = new LigneCommande(order,produit);
            order.getLigneCommandes().add(LCommand);
            commandeRepository.save(order);
        }

    }
     */


/*     public Client findOrderClient(Long id) {
        Commande order= commandeRepository.findById(id).orElse(null);
        if(order!=null)
        {
            Client client = order.getClientCommande();
            return client;
        }
        return null;
    }*/
}
