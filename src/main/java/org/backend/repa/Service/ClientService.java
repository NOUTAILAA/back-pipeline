package org.backend.repa.Service;

import lombok.RequiredArgsConstructor;
import org.backend.repa.Rep.IntrepClient;
import org.backend.repa.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements InClientService{
    private final IntrepClient intrepClient;

    public ClientService(IntrepClient intrepClient) {
        this.intrepClient = intrepClient;
    }

    @Override
    public List<Client> getClients() {
        return intrepClient.findAll();
    }

    @Override
    public Client getClient(Long idclient) {
        return intrepClient.findById(idclient).orElse(null);
    }

    @Override
    public Client addClient(Client idclient) {
        Client client = intrepClient.save(idclient);
        return client;
    }

    @Override
    public void deleteClient(Long idclient) {
        Client client = intrepClient.findById(idclient).orElse(null);
        if(client != null) {
            intrepClient.delete(client);
        }

    }

    @Override
    public Client modifierClient(Client newClient) {
        Client client = intrepClient.findById(newClient.getIdclient()).orElse(null);
        if(client != null) {
             return intrepClient.save(newClient);
        }
        return null;

    }
}
