package ensat.dca.entites;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "ligne_facture")
public class LigneCommande implements Serializable {
    @Id
    @EmbeddedId
   private LigneCommandeKey id;
    @ManyToOne()
    @MapsId("commandeId")
    @JoinColumn(name= "commande_id")
    private Commande commande;
    @ManyToOne()
    @MapsId("produitId")
    @JoinColumn(name= "produit_id")
    private Produit produit;
    private Integer quantite;

    private Double TotalPrice;


    public LigneCommandeKey getId() {
        return id;
    }

    public void setId(LigneCommandeKey id) {
        this.id = id;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

   public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }



    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        TotalPrice = totalPrice;
    }

    public LigneCommande() {

    }

    public LigneCommande( Commande commande,Integer quantite, Produit produit) {
        this.commande = commande;
        this.produit = produit;
        this.quantite = quantite;
    }


    @PrePersist
    @PreUpdate
    public void calculateTotalPrice() {
        if(produit != null)
        {
            if (quantite != null) {
           TotalPrice = quantite * produit.getPrix();

            }
        }
    }
}
