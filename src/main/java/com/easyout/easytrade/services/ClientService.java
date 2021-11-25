package com.easyout.easytrade.services;


import com.easyout.easytrade.models.Client;
import com.easyout.easytrade.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {


   private final ClientRepository clientRepository;

   @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

    public void addNewClient(Client client) {
      // validation
        clientRepository.save(client);
    }
}
