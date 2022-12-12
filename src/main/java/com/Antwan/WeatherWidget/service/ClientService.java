package com.Antwan.WeatherWidget.service;

import com.Antwan.WeatherWidget.model.Client;
import com.Antwan.WeatherWidget.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public Client getClient(long id) {
        return clientRepository.findById(id).get();
    }
    public Client getClientByEmail(String email) {
        return clientRepository.findByEmail(email).orElse(null);
    }
}
