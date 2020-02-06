package com.mja.controller;

import com.mja.model.agent.InsuranceAgent;
import com.mja.service.InsuranceAgentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/agent")
@RestController
public class AgentManagerController {

    InsuranceAgentService insuranceAgentService;

    public AgentManagerController(InsuranceAgentService insuranceAgentService) {
        this.insuranceAgentService = insuranceAgentService;
    }

    @PostMapping("/add-agent")
    public ResponseEntity<InsuranceAgent> addWorker(@RequestBody InsuranceAgent insuranceAgent) {
        return ResponseEntity.ok(insuranceAgentService.save(insuranceAgent));
    }
}
