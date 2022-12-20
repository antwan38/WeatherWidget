package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.Client;
import com.Antwan.WeatherWidget.service.ClientService;
import com.SocialInfoGetter.SocialInfoGetter.AccessToken;
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
    public Client socialLogin(@RequestBody final Map<String, String> clientAccessToken) {
        AccessToken accessToken = new AccessToken(clientAccessToken.get("accessToken"));
        return clientService.putClient(accessToken);

    }

    @GetMapping("/")
    public Client getUser(@RequestParam("id") long id) {
       return clientService.getClient(id);
    }
}
