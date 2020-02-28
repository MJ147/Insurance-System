package com.mja.model.policy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mja.model.client.Client;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonBackReference
    @ToString.Exclude
    private Client client;
    private boolean toRemove = false;
    @Enumerated
    private TypeOfPolicy typeOfPolicy;

    public InsurancePolicy(TypeOfPolicy typeOfPolicy) {
        this.typeOfPolicy = typeOfPolicy;
    }
}
