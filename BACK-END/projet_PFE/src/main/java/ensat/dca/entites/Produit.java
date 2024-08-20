package ensat.dca.entites;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="produit")
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private double prix;
    @Column(nullable = false)
    private int quantite_stock;


    @OneToMany(mappedBy = "produit",fetch = FetchType.LAZY)
    private Set<LigneCommande> ligneCommandes;

    @ManyToOne
    private Fournisseur fournisseur;

    public Produit() {
    }

    public Produit(Long id, String nom, double prix, int quantite_stock) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite_stock = quantite_stock;
    }

    public Produit( String nom, double prix, int quantite_stock) {
        this.nom = nom;
        this.prix = prix;
        this.quantite_stock = quantite_stock;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getQuantite_stock() {
        return quantite_stock;
    }

    public void setQuantite_stock(int quantite_stock) {
        this.quantite_stock = quantite_stock;
    }


    public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }
    public Integer getFournisseurtIdByProduit()
    {
        return fournisseur !=null? fournisseur.getId() : null;

    }
}
