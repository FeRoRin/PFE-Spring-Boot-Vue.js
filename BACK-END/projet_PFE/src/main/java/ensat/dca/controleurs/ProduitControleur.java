package ensat.dca.controleurs;



import ensat.dca.entites.*;
import ensat.dca.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api/Produits")
public class ProduitControleur {

    @Autowired
    private ProduitService produitService ;

    @GetMapping(value = "/Produit")
    public List<Produit> getLesProduits() {
        return produitService.getLesProduits();
    }

    @GetMapping(value = "/Produit/{id}")
    public Optional<Produit> getProduit(@PathVariable Long id){
        return produitService.getProduit(id);
    }


    // @RequestMapping(method = RequestMethod.POST, value = "/Produit")
    @PostMapping(value = "/Produit")
    public void addProduit(@RequestBody Produit produit){
        produitService.addProduit(produit);
    }

    //@RequestMapping(method = RequestMethod.PUT,value = "/Produit/{code}")
    @PutMapping(value = "/Produit")
    public void updateProduit(@RequestBody Produit produit){
        produitService.updateProduit(produit);
    }
    @DeleteMapping(value = "/Produit/{id}")
    public void deleteProduit(@PathVariable Long id ){
        produitService.deleteProduit(id);
    }
}
