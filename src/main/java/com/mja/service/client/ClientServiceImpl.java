package com.mja.service.client;

import com.mja.dao.client.ClientDao;
import com.mja.model.client.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    ClientDao clientDao;

    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public Client save(Client client) {
        return clientDao.save(client);
    }

    @Override
    public List<Client> removeById(Long id) {
        return clientDao.removeById(id);
    }

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public List<Client> findAllByInsuranceAgentIsNull() {
        return clientDao.findAllByInsuranceAgentIsNull();
    }

    @Override
    public Client findFirstById(Long id) {
        return clientDao.findFirstById(id);
    }
}
