package com.mja.dao.client;

import com.mja.model.client.Client;
import com.mja.model.policy.InsurancePolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDao extends CrudRepository<Client, Long> {

    Client save(Client client);

    List<Client>removeById(Long id);

    List<Client>findAll();

}
