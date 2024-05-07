package org.backend.repa.Controller;

import org.backend.repa.Service.ClientService;
import org.backend.repa.model.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
@CrossOrigin("*")
public class ClientController {
    private ClientService cs;
    public  ClientController(ClientService cs) {
        this.cs=cs;
    }
    @GetMapping
    public List<Client> getClients(){
        return cs.getClients();
    }

    @GetMapping("/{id}")
    public Client getClients(long idClient){
        return cs.getClient(idClient);
    }
    @PostMapping
    public Client addClient(Client c1){
        return cs.addClient(c1);
    }
    @PutMapping
    public Client ModiClient(Client c1){
        return cs.modifierClient(c1);
    }
}
