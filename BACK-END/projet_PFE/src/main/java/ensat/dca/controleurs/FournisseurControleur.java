package ensat.dca.controleurs;

import org.springframework.web.bind.annotation.RestController;
import ensat.dca.entites.*;
import ensat.dca.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
//@RequestMapping("/api/Fournisseurs")
public class FournisseurControleur {
    @Autowired
    private FournisseurService fournisseurService ;

    @GetMapping(value = "/Fournisseur")
    public List<Fournisseur> getLesFournisseurs() {
        return fournisseurService.getLesFournisseurs();
    }

    @GetMapping(value = "/Fournisseur/{id}")
    public Optional<Fournisseur> getFournisseur(@PathVariable Long id){
        return fournisseurService.getFournisseur(id);
    }


    // @RequestMapping(method = RequestMethod.POST, value = "/mesproduits")
    @PostMapping(value = "/Fournisseur")
    public void addFournisseur(@RequestBody Fournisseur fournisseur){
        fournisseurService.addFournisseur(fournisseur);
    }

    //@RequestMapping(method = RequestMethod.PUT,value = "/mesproduits/{code}")
    @PutMapping(value = "/Fournisseur")
    public void updateFournisseur(@RequestBody Fournisseur fournisseur){
        fournisseurService.updateFournisseur(fournisseur);
    }
    @DeleteMapping(value = "/Fournisseur/{id}")
    public void deleteFournisseur(@PathVariable Long id ){
        fournisseurService.deleteFournisseur(id);
    }


   /* @GetMapping(value = "/Fournisseur/{id}")
    public List<Produit> getListProductByFournisseur(@PathVariable Long id){
        return fournisseurService.getListProductByFournisseur(id);
    }*/

}
