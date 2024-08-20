package ensat.dca.DTO;

import ensat.dca.entites.LigneCommande;
import jakarta.persistence.PrePersist;
import org.springframework.stereotype.Component;

@Component
public class LigneCommandeListener {
    @PrePersist
    public void prePresist(LigneCommande ligneCommande)
    {
        if(ligneCommande.getTotalPrice() == null)
        {
            ligneCommande.calculateTotalPrice();
        }
    }

}
