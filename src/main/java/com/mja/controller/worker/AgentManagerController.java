package com.mja.controller.worker;

import com.mja.model.worker.AgentManager;
import com.mja.model.worker.InsuranceAgent;
import com.mja.model.client.Client;
import com.mja.model.policy.CarInsurancePolicy;
import com.mja.model.policy.HomeInsurancePolicy;
import com.mja.model.policy.LifeInsurancePolicy;
import com.mja.model.policy.insuranceobject.Car;
import com.mja.model.policy.insuranceobject.Home;
import com.mja.service.worker.AgentManagerService;
import com.mja.service.client.ClientService;
import com.mja.service.worker.InsuranceAgentService;
import com.mja.service.policy.CarInsurancePolicyService;
import com.mja.service.policy.HomeInsurancePolicyService;
import com.mja.service.policy.LifeInsurancePolicyService;
import com.mja.service.policy.insuranceobject.CarService;
import com.mja.service.policy.insuranceobject.HomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/manager")
@RestController
public class AgentManagerController {

    private AgentManagerService agentManagerService;
    private InsuranceAgentService insuranceAgentService;
    private ClientService clientService;
    private LifeInsurancePolicyService lifeInsurancePolicyService;
    private CarInsurancePolicyService carInsurancePolicyService;
    private HomeInsurancePolicyService homeInsurancePolicyService;
    private CarService carService;
    private HomeService homeService;

    public AgentManagerController(AgentManagerService agentManagerService, InsuranceAgentService insuranceAgentService, ClientService clientService, LifeInsurancePolicyService lifeInsurancePolicyService,
                                  CarInsurancePolicyService carInsurancePolicyService, HomeInsurancePolicyService homeInsurancePolicyService, CarService carService, HomeService homeService) {
        this.agentManagerService = agentManagerService;
        this.insuranceAgentService = insuranceAgentService;
        this.clientService = clientService;
        this.lifeInsurancePolicyService = lifeInsurancePolicyService;
        this.carInsurancePolicyService = carInsurancePolicyService;
        this.homeInsurancePolicyService = homeInsurancePolicyService;
        this.carService = carService;
        this.homeService = homeService;
    }

    // AGENT
    @PostMapping("/add-agent")
    public ResponseEntity<InsuranceAgent> addInsuranceAgent(@RequestBody InsuranceAgent insuranceAgent) {
        return ResponseEntity.ok(insuranceAgentService.save(insuranceAgent));
    }

    @PostMapping("/remove-agent")
    public ResponseEntity<List<InsuranceAgent>> removeInsuranceAgent(@RequestParam Long id) {
        return ResponseEntity.ok(insuranceAgentService.removeById(id));
    }

    @GetMapping("/list-all-agents")
    public ResponseEntity<List<InsuranceAgent>> listAllInsuranceAgents() {
        return ResponseEntity.ok(insuranceAgentService.findAll());
    }
    // MANAGER
    @PostMapping("/add-manager")
    public ResponseEntity<AgentManager> addAgentManager(@RequestBody AgentManager agentManager) {
        return ResponseEntity.ok(agentManagerService.save(agentManager));
    }

    @PostMapping("/remove-manager")
    public ResponseEntity<List<AgentManager>> removeAgentManager(@RequestParam Long id) {
        return ResponseEntity.ok(agentManagerService.removeById(id));
    }

    @GetMapping("/list-all-managers")
    public ResponseEntity<List<AgentManager>> listAllAgentsManager() {
        return ResponseEntity.ok(agentManagerService.findAll());
    }
    // CLIENT
    @PostMapping("/add-client")
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.save(client));
    }

    @PostMapping("/remove-client")
    public ResponseEntity<List<Client>> removeClient(@RequestParam Long id) {
        return ResponseEntity.ok(clientService.removeById(id));
    }

    @GetMapping("/list-all-clients")
    public ResponseEntity<List<Client>> listAllClients() {
        return ResponseEntity.ok(clientService.findAll());
    }
    // LIFE POLICY
    @PostMapping("/add-life-policy")
    public ResponseEntity<LifeInsurancePolicy> addLifeInsurancePolicy(@RequestBody LifeInsurancePolicy lifeInsurancePolicy) {
        return ResponseEntity.ok(lifeInsurancePolicyService.save(lifeInsurancePolicy));
    }

    @PostMapping("/remove-life-policy")
    public ResponseEntity<List<LifeInsurancePolicy>> removeLifeInsurancePolicy(@RequestParam Long id) {
        return ResponseEntity.ok(lifeInsurancePolicyService.removeById(id));
    }

    @GetMapping("/list-life-policies")
    public ResponseEntity<List<LifeInsurancePolicy>> listLifeInsurancePolicies() {
        return ResponseEntity.ok(lifeInsurancePolicyService.findAll());
    }
    // CAR POLICY
    @PostMapping("/add-car-policy")
    public ResponseEntity<CarInsurancePolicy> addCarInsurancePolicy(@RequestBody CarInsurancePolicy carInsurancePolicy) {
        return ResponseEntity.ok(carInsurancePolicyService.save(carInsurancePolicy));
    }

    @PostMapping("/remove-car-policy")
    public ResponseEntity<List<CarInsurancePolicy>> removeCarInsurancePolicy(@RequestParam Long id) {
        return ResponseEntity.ok(carInsurancePolicyService.removeById(id));
    }

    @GetMapping("/list-car-policies")
    public ResponseEntity<List<CarInsurancePolicy>> listCarInsurancePolicies() {
        return ResponseEntity.ok(carInsurancePolicyService.findAll());
    }
    // HOME POLICY
    @PostMapping("/add-home-policy")
    public ResponseEntity<HomeInsurancePolicy> addHomeInsurancePolicy(@RequestBody HomeInsurancePolicy homeInsurancePolicy) {
        return ResponseEntity.ok(homeInsurancePolicyService.save(homeInsurancePolicy));
    }

    @PostMapping("/remove-home-policy")
    public ResponseEntity<List<HomeInsurancePolicy>> removeHomeInsurancePolicy(@RequestParam Long id) {
        return ResponseEntity.ok(homeInsurancePolicyService.removeById(id));
    }

    @GetMapping("/list-home-policies")
    public ResponseEntity<List<HomeInsurancePolicy>> listHomeInsurancePolicies() {
        return ResponseEntity.ok(homeInsurancePolicyService.findAll());
    }
    // CAR
    @PostMapping("/add-car")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        return ResponseEntity.ok(carService.save(car));
    }

    @PostMapping("/remove-car")
    public ResponseEntity<List<Car>> removeCar(@RequestParam Long id) {
        return ResponseEntity.ok(carService.removeById(id));
    }

    @GetMapping("/list-all-cars")
    public ResponseEntity<List<Car>> listAllInsuranceObject() {
        return ResponseEntity.ok(carService.findAll());
    }
    // Home
    @PostMapping("/add-home")
    public ResponseEntity<Home> addHome(@RequestBody Home home) {
        return ResponseEntity.ok(homeService.save(home));
    }

    @PostMapping("/remove-home")
    public ResponseEntity<List<Home>> removeHome(@RequestParam Long id) {
        return ResponseEntity.ok(homeService.removeById(id));
    }

    @GetMapping("/list-all-homes")
    public ResponseEntity<List<Home>> listAllHome() {
        return ResponseEntity.ok(homeService.findAll());
    }
}
