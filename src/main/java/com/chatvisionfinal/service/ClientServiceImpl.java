package com.chatvisionfinal.service;

import com.chatvisionfinal.entity.Client;
import com.chatvisionfinal.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
   private ClientRepository clientRepository;
    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll(); // Fetches all clients from the database
    }
}
