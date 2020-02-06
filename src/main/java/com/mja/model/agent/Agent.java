package com.mja.model.agent;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public abstract class Agent {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String secondName;

}
