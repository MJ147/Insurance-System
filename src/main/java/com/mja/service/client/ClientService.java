package com.mja.service.client;

import com.mja.model.client.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    Client save(Client client);

    List<Client> removeById(Long id);

    List<Client> findAll();

    List<Client>findAllByInsuranceAgentIsNull();

    Client findFirstById(Long id);
}
