package ensat.dca.controleurs;

import ensat.dca.DTO.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ensat.dca.entites.*;
import ensat.dca.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.InvalidClassException;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api/Clients")
public class ClientControleur {
    @Autowired
    private ClientService clientService ;

    @GetMapping(value = "/Client")
    public List<Client> getLesClients() {
        return clientService.getLesClients();
    }
    @GetMapping(value = "/allclient")
    public List<Client> getAllClient(){return clientService.getAllClients();}

    @GetMapping(value = "/Client/{id}")
    public Optional<Client> getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }

    @PostMapping(value = "/Client")
    public void addClient(@RequestBody Client client){
        clientService.addClient(client);
    }

    @PutMapping(value = "/Client")
    public void updateClient(@RequestBody Client client){
        clientService.updateClient(client);
    }

    @DeleteMapping(value = "/Client/{id}")
    public void deleteClient(@PathVariable Long id ){
        clientService.deleteClient(id);
    }

   @GetMapping(value = "/Client/{id}/Commande")
    public List<Commande> getClientIsCommande(@PathVariable Long id) {
        return clientService.getListOrderByIdClient(id);
    }

    @PutMapping(value = "/Client/{id}")
    public void makeClientManager(@PathVariable Long id){
        clientService.makeClientManager(id);
    }/* */

    @PostMapping(value = "/Client/login")
    public ResponseEntity<?>  login(@RequestBody LoginRequest loginRequest)
    { //return clientService.logIn(loginRequest.getEmail(),loginRequest.getPassword());
        Optional<Client> clientOptional = clientService.logIn(loginRequest.getEmail(), loginRequest.getPassword());

        if (clientOptional.isPresent()) {
            Client client = clientOptional.get();
            return ResponseEntity.status(HttpStatus.OK).body(client);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Error: Failed to LogIn !!!");
        }
    }


}
