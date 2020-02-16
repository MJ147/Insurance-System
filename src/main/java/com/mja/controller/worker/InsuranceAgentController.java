package com.mja.controller.worker;

import com.mja.model.client.Client;
import com.mja.service.client.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/agent")
@RestController
public class InsuranceAgentController {

    ClientService clientService;

    public InsuranceAgentController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/add_client")
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.save(client));
    }
}
