package com.mja.service.client;

import com.mja.dao.client.ClientDao;
import com.mja.model.client.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    ClientDao ClientDao;

    public ClientServiceImpl(ClientDao ClientDao) {
        this.ClientDao = ClientDao;
    }

    @Override
    public Client save(Client client) {
        return ClientDao.save(client);
    }

    @Override
    public List<Client> removeById(Long id) {
        return ClientDao.removeById(id);
    }

    @Override
    public List<Client> findAll() {
        return ClientDao.findAll();
    }
}
