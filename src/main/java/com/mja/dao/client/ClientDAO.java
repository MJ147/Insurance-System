package com.mja.dao.client;

import com.mja.model.client.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDAO extends CrudRepository<Client, Long> {

    Client save(Client client);

    Client findById(Client client);

    List<Client> findAllByFirstNameAndSecondName(String firstName, String secondName);

    List<Client> listAll();

    Client deleteClientByIdAndFirstNameAndSecondName(Long id, String firstName, String secondName);


}
