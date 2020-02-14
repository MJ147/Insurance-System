package com.mja.model.policy.insuranceobject;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mja.model.policy.HomeInsurancePolicy;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

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
    private boolean isAlarm;
    private boolean isGarage;
    @OneToOne
    @MapsId
    @JsonBackReference
    @ToString.Exclude
    private HomeInsurancePolicy homeInsurancePolicy;

    public Home(int area, int numberOfFloors, boolean isAlarm, boolean isGarage) {
        this.area = area;
        this.numberOfFloors = numberOfFloors;
        this.isAlarm = isAlarm;
        this.isGarage = isGarage;
    }
}

