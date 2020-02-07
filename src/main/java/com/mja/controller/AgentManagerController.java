package com.mja.controller;

import com.mja.model.agent.InsuranceAgent;
import com.mja.service.InsuranceAgentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/agent_manager")
@RestController
public class AgentManagerController {

    InsuranceAgentService insuranceAgentService;

    public AgentManagerController(InsuranceAgentService insuranceAgentService) {
        this.insuranceAgentService = insuranceAgentService;
    }

    @PostMapping("/add_insurance_agent")
    public ResponseEntity<InsuranceAgent> addInsuranceAgent(@RequestBody InsuranceAgent insuranceAgent) {
        return ResponseEntity.ok(insuranceAgentService.save(insuranceAgent));
    }

    @GetMapping("/list_all")
    public ResponseEntity<List<InsuranceAgent>> listAllInsuranceAgent() {
        return ResponseEntity.ok(insuranceAgentService.findAll());
    }
}
