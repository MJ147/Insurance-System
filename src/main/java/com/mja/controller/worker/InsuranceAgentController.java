package com.mja.controller.worker;

import com.mja.model.client.Client;
import com.mja.model.worker.InsuranceAgent;
import com.mja.service.client.ClientService;
import com.mja.service.worker.InsuranceAgentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RequestMapping("/agent")
@RestController
public class InsuranceAgentController {

    ClientService clientService;
    InsuranceAgentService insuranceAgentService;

    public InsuranceAgentController(ClientService clientService, InsuranceAgentService insuranceAgentService) {
        this.clientService = clientService;
        this.insuranceAgentService = insuranceAgentService;
    }

    @PostMapping("/add_client")
    public ResponseEntity<Client> addClient(@RequestBody Client client, @RequestParam Long agentId) {
        InsuranceAgent insuranceAgent = insuranceAgentService.findFirstById(agentId);
        insuranceAgent.setClients(Arrays.asList(client));
        client.setInsuranceAgent(insuranceAgent);
        return ResponseEntity.ok(clientService.save(client));
    }

    @PostMapping("/update_client")
    public ResponseEntity<Client> updateClient(@RequestParam(required = true) Long clientId,
                                               @RequestParam(required = false) String firstName,
                                               @RequestParam(required = false) String secondName,
                                               @RequestParam(required = false) Long insuranceAgentId) {
        Client client =  clientService.findFirstById(clientId);
        if (firstName != null) {
            client.setFirstName(firstName);
        }
        if (secondName != null) {
            client.setSecondName(secondName);
        }
        if (insuranceAgentId != null) {
            InsuranceAgent insuranceAgent = insuranceAgentService.findFirstById(insuranceAgentId);
            client.setInsuranceAgent(insuranceAgent);
            insuranceAgent.setClients(Arrays.asList(client));
        }

        return ResponseEntity.ok(clientService.save(client));
    }


}
