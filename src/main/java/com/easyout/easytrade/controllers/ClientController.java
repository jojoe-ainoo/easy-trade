package com.easyout.easytrade.controllers;

import com.easyout.easytrade.models.Client;
import com.easyout.easytrade.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "v1/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients() {return clientService.getAllClients();}

    @PostMapping()
    public void registerNewClient(@RequestBody Client client) {clientService.addNewClient(client);}


}
