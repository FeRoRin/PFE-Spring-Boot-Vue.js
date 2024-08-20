package ensat.dca.controleurs;

import ensat.dca.DTO.CommandeRequest;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ensat.dca.entites.*;
import ensat.dca.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api/Commandes")
public class CommandeControleur {
    @Autowired
    private CommandeService commandeService ;
    private ClientService clientService;
    @GetMapping(value = "/Commande")
    public List<Commande> getLesCommandes() {
        return commandeService.getLesCommandes();
    }

    @GetMapping(value = "/Commande/{id}")
    public Optional<Commande> getCommande(@PathVariable Long id){
        return commandeService.getCommande(id);
    }

    @PostMapping(value = "/Commande")
    public void addCommande(@RequestBody Commande commande){
        commandeService.addCommande(commande);
    }

    @PutMapping(value = "/Commande")
    public void updateCommande(@RequestBody Commande commande){
        commandeService.updateCommande(commande);
    }

    @DeleteMapping(value = "/Commande/{id}")
    public void deleteCommande(@PathVariable Long id ){
        commandeService.deleteCommande(id);
    }

   /* @GetMapping(value = "/Commande/{id}/Client")
    public Client getCommandsIsClient(@PathVariable Long id){return commandeService.findOrderClient(id);
    }*/




}
