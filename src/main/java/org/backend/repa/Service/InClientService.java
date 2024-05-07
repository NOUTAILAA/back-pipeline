package org.backend.repa.Service;

import org.backend.repa.model.Client;

import java.util.List;

public interface InClientService {
    List<Client> getClients();
    Client getClient(Long idclient);
    Client addClient(Client idclient);
    void deleteClient(Long idclient);

    Client modifierClient(Client newClient);

}
