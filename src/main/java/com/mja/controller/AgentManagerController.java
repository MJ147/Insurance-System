package com.mja.controller;

import com.mja.model.agent.AgentManager;
import com.mja.model.agent.InsuranceAgent;
import com.mja.model.policy.InsurancePolicy;
import com.mja.service.AgentManagerService;
import com.mja.service.InsuranceAgentService;
import com.mja.service.InsurancePolicyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/manager")
@RestController
public class AgentManagerController {

    AgentManagerService agentManagerService;
    InsuranceAgentService insuranceAgentService;
    InsurancePolicyService insurancePolicyService;

    public AgentManagerController(AgentManagerService agentManagerService, InsuranceAgentService insuranceAgentService, InsurancePolicyService insurancePolicyService) {
        this.agentManagerService = agentManagerService;
        this.insuranceAgentService = insuranceAgentService;
        this.insurancePolicyService = insurancePolicyService;
    }

    @PostMapping("/add_agent")
    public ResponseEntity<InsuranceAgent> addInsuranceAgent(@RequestBody InsuranceAgent insuranceAgent) {
        return ResponseEntity.ok(insuranceAgentService.save(insuranceAgent));
    }

    @PostMapping("/remove_agent")
    public ResponseEntity<List<InsuranceAgent>> removeInsuranceAgent(@RequestParam Long id) {
        return ResponseEntity.ok(insuranceAgentService.removeById(id));
    }

    @GetMapping("/list_all_agents")
    public ResponseEntity<List<InsuranceAgent>> listAllInsuranceAgents() {
        return ResponseEntity.ok(insuranceAgentService.findAll());
    }

    @PostMapping("/add_manager")
    public ResponseEntity<AgentManager> addAgentManager(@RequestBody AgentManager agentManager) {
        return ResponseEntity.ok(agentManagerService.save(agentManager));
    }

    @PostMapping("/remove_manager")
    public ResponseEntity<List<AgentManager>> removeAgentManager(@RequestParam Long id) {
        return ResponseEntity.ok(agentManagerService.removeById(id));
    }

    @GetMapping("/list_all_manager")
    public ResponseEntity<List<AgentManager>> listAllAgentsManager() {
        return ResponseEntity.ok(agentManagerService.findAll());
    }

    @PostMapping("/add_policy")
    public ResponseEntity<InsurancePolicy> addInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy) {
        return ResponseEntity.ok(insurancePolicyService.save(insurancePolicy));
    }

    @PostMapping("/remove_policy")
    public ResponseEntity<List<InsurancePolicy>> removeInsurancePolicy(@RequestParam Long id) {
        return ResponseEntity.ok(insurancePolicyService.removeById(id));
    }

    @GetMapping("/list_all_policies")
    public ResponseEntity<List<InsurancePolicy>> listAllInsurancePolicies() {
        return ResponseEntity.ok(insurancePolicyService.findAll());
    }
}
