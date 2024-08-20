package ensat.dca.entites;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Transient
    private double facture;
    @Column(nullable = false,name = "date_creation_commande")
    private Date date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="client_id")
    private Client client;

    @OneToMany(mappedBy = "commande",fetch = FetchType.LAZY)
    private  Set<LigneCommande> ligneCommandes;



    public Commande() {
    }

    public Commande(Long id, double facture, Date date) {
        this.id = id;
        this.facture = facture;
        this.date = date;
    }
    public Commande( double facture, Date date) {
        this.facture = facture;
        this.date = date;
    }

/*
    public void calculateInvoice() {
        if (ligneCommandes != null) {
            facture = ligneCommandes.stream().mapToDouble(LigneCommande::getTotalPrice).sum();
        } else {
            facture = 0.0;
        }
    }*/

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getFacture() {
        return facture;
    }

    public void setFacture(double facture) {
        this.facture = facture;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void setLigneCommandes(Set<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getClientIdByOrder()
   {
       return client !=null? client.getId() : null;

   }

}
