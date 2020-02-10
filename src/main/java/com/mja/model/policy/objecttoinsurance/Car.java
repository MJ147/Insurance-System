package com.mja.model.policy.objecttoinsurance;

import com.mja.model.policy.CarInsurancePolicy;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String make;
    private String model;
    private Integer modelYear;
    private String engine;
    private Boolean isAlarm;
    @OneToOne
    private CarInsurancePolicy carInsurancePolicy;
}
