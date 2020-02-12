package com.mja.util;

import com.mja.dao.agent.AgentManagerDao;
import com.mja.dao.agent.InsuranceAgentDao;
import com.mja.dao.client.ClientDao;
import com.mja.dao.policy.CarInsurancePolicyDao;
import com.mja.dao.policy.HomeInsurancePolicyDao;
import com.mja.dao.policy.LifeInsurancePolicyDao;
import com.mja.dao.policy.insuranceobject.CarDao;
import com.mja.dao.policy.insuranceobject.HomeDao;
import com.mja.model.agent.AgentManager;
import com.mja.model.agent.InsuranceAgent;
import com.mja.model.client.Client;
import com.mja.model.policy.*;
import com.mja.model.policy.insuranceobject.Car;
import com.mja.model.policy.insuranceobject.Home;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Data
@Component
public class DataGenerator {

    InsuranceAgentDao insuranceAgentDao;
    AgentManagerDao agentManagerDao;
    ClientDao clientDao;
    LifeInsurancePolicyDao lifeInsurancePolicyDao;
    CarInsurancePolicyDao carInsurancePolicyDao;
    HomeInsurancePolicyDao homeInsurancePolicyDao;
    CarDao carDao;
    HomeDao homeDao;

    public DataGenerator(InsuranceAgentDao insuranceAgentDao, AgentManagerDao agentManagerDao, ClientDao clientDao, LifeInsurancePolicyDao lifeInsurancePolicyDao, CarInsurancePolicyDao carInsurancePolicyDao, HomeInsurancePolicyDao homeInsurancePolicyDao, CarDao carDao, HomeDao homeDao) {
        this.insuranceAgentDao = insuranceAgentDao;
        this.agentManagerDao = agentManagerDao;
        this.clientDao = clientDao;
        this.lifeInsurancePolicyDao = lifeInsurancePolicyDao;
        this.carInsurancePolicyDao = carInsurancePolicyDao;
        this.homeInsurancePolicyDao = homeInsurancePolicyDao;
        this.carDao = carDao;
        this.homeDao = homeDao;
    }

    public void createData() {

        Car car1 = new Car("Honda", "Civic", 2005, "1.9 TDI");
        Car car2 = new Car("Renault", "Clio", 2014, "1.2 16V");
        Car car3 = new Car("Mitsubishi", "ASX", 2019, "2.0 MIVEC");
        Car car4 = new Car("Toyota", "Corolla", 2013, "1.3 16V");
        Car car5 = new Car("Opel", "Corsa", 2018, "1.5 D");
        Car car6 = new Car("Opel", "Insignia", 2016, "2.0 CDTI");

        Home home1 = new Home(70,1);
        Home home2 = new Home(150,2);
        Home home3 = new Home(110,1);
        Home home4 = new Home(80,1);
        Home home5 = new Home(220,2);

        LifeInsurancePolicy lifeInsurancePolicy1 = new LifeInsurancePolicy(TypeOfPolicy.LIFE_INSURANCE, LocalDate.parse("2020-01-01"), LocalDate.parse("2021-01-01"), 25, SexEnum.FEMALE);
        LifeInsurancePolicy lifeInsurancePolicy2 = new LifeInsurancePolicy(TypeOfPolicy.LIFE_INSURANCE, LocalDate.parse("2020-03-10"), LocalDate.parse("2021-03-10"), 30, SexEnum.MALE);
        LifeInsurancePolicy lifeInsurancePolicy3 = new LifeInsurancePolicy(TypeOfPolicy.LIFE_INSURANCE, LocalDate.parse("2019-06-15"), LocalDate.parse("2022-06-15"), 60, SexEnum.MALE);
        LifeInsurancePolicy lifeInsurancePolicy4 = new LifeInsurancePolicy(TypeOfPolicy.LIFE_INSURANCE, LocalDate.parse("2019-02-05"), LocalDate.parse("2019-02-05"), 40, SexEnum.FEMALE);

        CarInsurancePolicy carInsurancePolicy1 = new CarInsurancePolicy(TypeOfPolicy.CAR_INSURANCE, LocalDate.parse("2019-06-01"), LocalDate.parse("2021-06-01"), car1);
        CarInsurancePolicy carInsurancePolicy2 = new CarInsurancePolicy(TypeOfPolicy.CAR_INSURANCE, LocalDate.parse("2019-02-22"), LocalDate.parse("2020-02-22"), car2);
        CarInsurancePolicy carInsurancePolicy3 = new CarInsurancePolicy(TypeOfPolicy.CAR_INSURANCE, LocalDate.parse("2019-06-09"), LocalDate.parse("2022-06-09"), car3);
        CarInsurancePolicy carInsurancePolicy4 = new CarInsurancePolicy(TypeOfPolicy.CAR_INSURANCE, LocalDate.parse("2019-11-05"), LocalDate.parse("2021-11-05"), car4);
        CarInsurancePolicy carInsurancePolicy5 = new CarInsurancePolicy(TypeOfPolicy.CAR_INSURANCE, LocalDate.parse("2019-05-20"), LocalDate.parse("2020-05-20"), car5);
        CarInsurancePolicy carInsurancePolicy6 = new CarInsurancePolicy(TypeOfPolicy.CAR_INSURANCE, LocalDate.parse("2019-08-11"), LocalDate.parse("2020-08-11"), car6);

        HomeInsurancePolicy homeInsurancePolicy1 = new HomeInsurancePolicy(TypeOfPolicy.HOME_INSURANCE, LocalDate.parse("2019-05-01"), LocalDate.parse("2022-05-01"), home1);
        HomeInsurancePolicy homeInsurancePolicy2 = new HomeInsurancePolicy(TypeOfPolicy.HOME_INSURANCE, LocalDate.parse("2019-08-11"), LocalDate.parse("2020-08-11"), home2);
        HomeInsurancePolicy homeInsurancePolicy3 = new HomeInsurancePolicy(TypeOfPolicy.HOME_INSURANCE, LocalDate.parse("2019-07-20"), LocalDate.parse("2021-07-20"), home3);
        HomeInsurancePolicy homeInsurancePolicy4 = new HomeInsurancePolicy(TypeOfPolicy.HOME_INSURANCE, LocalDate.parse("2019-02-25"), LocalDate.parse("2020-02-25"), home4);
        HomeInsurancePolicy homeInsurancePolicy5 = new HomeInsurancePolicy(TypeOfPolicy.HOME_INSURANCE, LocalDate.parse("2019-11-11"), LocalDate.parse("2023-11-11"), home5);

        car1.setCarInsurancePolicy(carInsurancePolicy1);
        car2.setCarInsurancePolicy(carInsurancePolicy2);
        car3.setCarInsurancePolicy(carInsurancePolicy3);
        car4.setCarInsurancePolicy(carInsurancePolicy4);
        car5.setCarInsurancePolicy(carInsurancePolicy5);
        car6.setCarInsurancePolicy(carInsurancePolicy6);

        home1.setHomeInsurancePolicy(homeInsurancePolicy1);
        home2.setHomeInsurancePolicy(homeInsurancePolicy2);
        home3.setHomeInsurancePolicy(homeInsurancePolicy3);
        home4.setHomeInsurancePolicy(homeInsurancePolicy4);
        home5.setHomeInsurancePolicy(homeInsurancePolicy5);

        Client client1 = new Client("Roman", "Romanowski", Arrays.asList(lifeInsurancePolicy1,carInsurancePolicy1,homeInsurancePolicy1));
        Client client2 = new Client("Karolina", "Jeżyna", Arrays.asList(lifeInsurancePolicy2,carInsurancePolicy2,carInsurancePolicy3,homeInsurancePolicy2));
        Client client3 = new Client("Paweł", "Oleksy", Arrays.asList(lifeInsurancePolicy3,carInsurancePolicy4,homeInsurancePolicy3));
        Client client4 = new Client("Stafan", "Marchewa", Arrays.asList(lifeInsurancePolicy4,carInsurancePolicy5,homeInsurancePolicy4));
        Client client5 = new Client("Alicja", "Penderewska", Arrays.asList(lifeInsurancePolicy4,carInsurancePolicy6,homeInsurancePolicy5));

        carDao.save(car1);
        carDao.save(car2);
        carDao.save(car3);
        carDao.save(car4);
        carDao.save(car5);
        carDao.save(car6);

        homeDao.save(home1);
        homeDao.save(home2);
        homeDao.save(home3);
        homeDao.save(home4);
        homeDao.save(home5);

        lifeInsurancePolicyDao.save(lifeInsurancePolicy1);
        lifeInsurancePolicyDao.save(lifeInsurancePolicy2);
        lifeInsurancePolicyDao.save(lifeInsurancePolicy3);
        lifeInsurancePolicyDao.save(lifeInsurancePolicy4);

        carInsurancePolicyDao.save(carInsurancePolicy1);
        carInsurancePolicyDao.save(carInsurancePolicy2);
        carInsurancePolicyDao.save(carInsurancePolicy3);
        carInsurancePolicyDao.save(carInsurancePolicy4);
        carInsurancePolicyDao.save(carInsurancePolicy5);
        carInsurancePolicyDao.save(carInsurancePolicy6);

        homeInsurancePolicyDao.save(homeInsurancePolicy1);
        homeInsurancePolicyDao.save(homeInsurancePolicy2);
        homeInsurancePolicyDao.save(homeInsurancePolicy3);
        homeInsurancePolicyDao.save(homeInsurancePolicy4);
        homeInsurancePolicyDao.save(homeInsurancePolicy5);

        //Agents

        InsuranceAgent insuranceAgent1 = new InsuranceAgent("Emil","Poczewski", Arrays.asList(client1,client2,client3));
        InsuranceAgent insuranceAgent2 = new InsuranceAgent("Adam","Temerski",  Arrays.asList(client3,client2));
        InsuranceAgent insuranceAgent3 = new InsuranceAgent("Jadwiga","Stawka",Arrays.asList(client4,client5));
        InsuranceAgent insuranceAgent4 = new InsuranceAgent("Elon","Musk");

        AgentManager agentManager1 = new AgentManager("Jan", "Kowalski", Arrays.asList(insuranceAgent1,insuranceAgent2,insuranceAgent3));

        agentManagerDao.save(agentManager1);

        insuranceAgent1.setAgentManager(agentManager1);
        insuranceAgent2.setAgentManager(agentManager1);
        insuranceAgent3.setAgentManager(agentManager1);
        insuranceAgent4.setAgentManager(agentManager1);

        insuranceAgentDao.save(insuranceAgent1);
        insuranceAgentDao.save(insuranceAgent2);
        insuranceAgentDao.save(insuranceAgent3);
        insuranceAgentDao.save(insuranceAgent4);

        client1.setInsuranceAgent(insuranceAgent1);
        client2.setInsuranceAgent(insuranceAgent1);
        client3.setInsuranceAgent(insuranceAgent1);
        client4.setInsuranceAgent(insuranceAgent2);
        client5.setInsuranceAgent(insuranceAgent3);

        clientDao.save(client1);
        clientDao.save(client2);
        clientDao.save(client3);
        clientDao.save(client4);
        clientDao.save(client5);
    }
}
