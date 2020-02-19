package com.mja.service.client;

import com.mja.dao.client.ClientDao;
import com.mja.dao.worker.InsuranceAgentDao;
import com.mja.model.client.Client;
import com.mja.model.worker.InsuranceAgent;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    ClientDao clientDao;
    InsuranceAgentDao insuranceAgentDao;

    public ClientServiceImpl(ClientDao clientDao, InsuranceAgentDao insuranceAgentDao) {
        this.clientDao = clientDao;
        this.insuranceAgentDao = insuranceAgentDao;
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

    @Override
    public Client update(Long clientId, String firstName, String secondName, Long insuranceAgentId) {
        Client client =  clientDao.findFirstById(clientId);
        if (firstName != null) {
            client.setFirstName(firstName);
        }
        if (secondName != null) {
            client.setSecondName(secondName);
        }
        if (insuranceAgentId != null) {
            InsuranceAgent insuranceAgent = insuranceAgentDao.findFirstById(insuranceAgentId);
            client.setInsuranceAgent(insuranceAgent);
            insuranceAgent.setClients(Arrays.asList(client));
        }
        return clientDao.save(client);
    }

}
