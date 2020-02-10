package com.mja.model.policy.objecttoinsurance;

import com.mja.model.policy.CarInsurancePolicy;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer area;
    private Integer numberOfFloors;
    private Boolean isCarGarage;
    private Boolean isAlarm;
    @OneToOne
    private CarInsurancePolicy carInsurancePolicy;
}

