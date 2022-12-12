package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.Client;
import com.Antwan.WeatherWidget.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @PostMapping("/")
    public Client socialLogin(@RequestBody Map<String, String> clientData) {
        Client client = new Client(clientData.get("name"), clientData.get("email"));
        if (clientService.getClientByEmail(client.getEmail()) == null) {
           return clientService.saveClient(client);
        } else {
            return clientService.getClientByEmail(client.getEmail());
        }

    }

    @GetMapping("/")
    public Client getUser(@RequestParam("id") long id) {
       return clientService.getClient(id);
    }
}
