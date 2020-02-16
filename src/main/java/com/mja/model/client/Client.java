package com.mja.model.client;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mja.model.worker.InsuranceAgent;
import com.mja.model.policy.InsurancePolicy;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    @OneToMany(mappedBy = "client")
    @JsonManagedReference
    private List<InsurancePolicy> insurancePolicies = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "insurance_agent")
    @JsonBackReference
    @ToString.Exclude
    private InsuranceAgent insuranceAgent;

    public Client(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.insurancePolicies = new ArrayList<>();
    }

    public Client(String firstName, String secondName, InsurancePolicy insurancePolicies) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.insurancePolicies.add(insurancePolicies);
    }

    public Client(String firstName, String secondName, List<InsurancePolicy> insurancePolicies) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.insurancePolicies.addAll(insurancePolicies);
    }
}
