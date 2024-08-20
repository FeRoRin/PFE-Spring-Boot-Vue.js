package ensat.dca.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LigneCommandeKey implements Serializable {
    @Column(name = "commande_id")
    private Integer commandeId;
    @Column(name = "produit_id")
    private Long produitId;
}
