package ensat.dca.services;

import org.springframework.stereotype.Service;
import ensat.dca.entites.*;
import ensat.dca.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurRepository fournisseurRepository;


    public List<Fournisseur> getLesFournisseurs() {
        return fournisseurRepository.findAll();
    }

    public Optional<Fournisseur> getFournisseur(Long id) {
        return fournisseurRepository.findById(id);
    }

    public void addFournisseur(Fournisseur fournisseur){
        fournisseurRepository.save(fournisseur);
    }

    public void updateFournisseur(Fournisseur fournisseur) {
        fournisseurRepository.save(fournisseur);
    }
    public void deleteFournisseur(Long id) {
        fournisseurRepository.deleteById(id);

    }

   /* public List<Produit> getListProductByFournisseur(Long id) {
        Fournisseur supplier = fournisseurRepository.findById(id).orElse(null);
        if(supplier!= null)
        {
            return supplier.getListProduit();
        }
        return null;
    }*/
}
