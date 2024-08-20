package ensat.dca.entites;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="fournisseur")
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false)
    private String telephone;

    @OneToMany(mappedBy = "fournisseur",fetch = FetchType.LAZY)
    private List<Produit> listProduit= new ArrayList<>();

    public Fournisseur() {
    }

    public Fournisseur(Integer id, String nom, String prenom, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Produit> getListProduit() {
        return listProduit;
    }

    public void setListProduit(List<Produit> listProduit) {
        this.listProduit = listProduit;
    }
}
