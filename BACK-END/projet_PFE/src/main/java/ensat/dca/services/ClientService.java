package ensat.dca.services;

import org.springframework.beans.InvalidPropertyException;
import org.springframework.stereotype.Service;
import ensat.dca.entites.*;
import ensat.dca.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;


    public List<Client> getLesClients() {
        return clientRepository.findAll();
    }

    public List<Client> getAllClients()
    {
        return clientRepository.findAll();
    }
    public Optional<Client> getClient(Long id) {
        return clientRepository.findById(id);
    }

    public void addClient(Client client){
        clientRepository.save(client);
    }

    public void updateClient(Client client) {
        clientRepository.save(client);
    }
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
   public List<Commande> getListOrderByIdClient(Long id) {
        Client client = clientRepository.findById(id).orElse(null);

        if(client != null){
            return client.getListCommandes();
        }
        return null;
    }

    public Client makeClientManager(Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        if(client != null){
            client.setManager(true);
            return clientRepository.save(client);
        }
        return null;
    }

    /**/
    public Client findClientByEmail(String email)
    {
       for(Client client: clientRepository.findAll())
       {
           if (client.getEmail().equals(email)) {
               return client;
           }
       }
       return null;
    }

    public Client findClientById(Long id)
    {
        for(Client client: clientRepository.findAll())
        {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }
    public Optional<Client> logIn(String email, String password) {

        long id = findClientByEmail(email).getId();

        Client client = clientRepository.findById(id).orElse(null);

        if (client != null && client.getPassword().equals(password) && client.getEmail().equals(email)) {
            return Optional.of(client);
        }

        return Optional.empty();
    }






}
