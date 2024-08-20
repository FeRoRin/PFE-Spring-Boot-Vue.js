package ensat.dca.entites;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="client")
public class Client implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private  String password;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private boolean isManager;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private List<Commande> listCommandes = new ArrayList<>();

    public Client() {
    }

    public Client(Long id, String firstName, String lastName, String email, String password, String phoneNumber, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Client(String firstName, String lastName, String email, String password, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public List<Commande> getListCommandes() {
        return listCommandes;
    }

    /*
    public void setListCommandes(List<Commande> listCommandes) {
        this.listCommandes = listCommandes;
    }*/

}
