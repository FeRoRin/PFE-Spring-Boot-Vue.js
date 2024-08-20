package ensat.dca.controleurs;

import ensat.dca.entites.Commande;
import ensat.dca.entites.LigneCommande;
import ensat.dca.entites.Produit;
import ensat.dca.services.LigneCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LigneCommandeControleur {
    @Autowired
    private LigneCommandeService ligneCommandeService;
    @GetMapping("/Produits/{orderId}")
    public ResponseEntity<List<Produit>> getProductByOrder(@PathVariable long orderId)
    {
        List<Produit> products = ligneCommandeService.GetProductsByOrderId(orderId);
        return new ResponseEntity<>(products, HttpStatus.OK);//ResponseEntity
    }
    @GetMapping( "/Countproduit/{Id}")
    public int etCountProduit(@PathVariable Long Id)
    {
        return ligneCommandeService.countProduct(Id);
    }
    ///1/////
    /*
    @PostMapping(value = "/newProduitatCommande")
    public void addCommande(@RequestBody LigneCommande ligneCommande){
        ligneCommandeService.createLigneCommande(ligneCommande);
    }*/

}
