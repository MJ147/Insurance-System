package com.mja.model.policy.insuranceobject;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mja.model.policy.HomeInsurancePolicy;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int area;
    private int numberOfFloors;
    @OneToOne
    @JoinColumn(name = "home_insurance_id")
    @JsonBackReference
    private HomeInsurancePolicy homeInsurancePolicy;

    public Home(int area, int numberOfFloors) {
        this.area = area;
        this.numberOfFloors = numberOfFloors;
    }
}

