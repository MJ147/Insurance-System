package com.mja.util;

import com.mja.dao.agent.AgentManagerDao;
import com.mja.dao.agent.InsuranceAgentDao;
import com.mja.model.agent.AgentManager;
import com.mja.model.agent.InsuranceAgent;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Data
@Component
public class DataGenerator {

    InsuranceAgentDao insuranceAgentDao;
    AgentManagerDao agentManagerDao;

    public DataGenerator(InsuranceAgentDao insuranceAgentDao, AgentManagerDao agentManagerDao) {
        this.insuranceAgentDao = insuranceAgentDao;
        this.agentManagerDao = agentManagerDao;
    }

    public void createData() {

        InsuranceAgent insuranceAgent1 = new InsuranceAgent("Emil","Poczewski");
        InsuranceAgent insuranceAgent2 = new InsuranceAgent("Adam","Temerski");
        InsuranceAgent insuranceAgent3 = new InsuranceAgent("Jadwiga","Stawka");

        insuranceAgentDao.save(insuranceAgent1);
        insuranceAgentDao.save(insuranceAgent2);
        insuranceAgentDao.save(insuranceAgent3);

        AgentManager agentManager1 = new AgentManager("Jan", "Kowalski", Arrays.asList(insuranceAgent1,insuranceAgent2,insuranceAgent3));

        agentManagerDao.save(agentManager1);

        InsuranceAgent insuranceAgent4 = new InsuranceAgent("Elon","Musk");
        insuranceAgentDao.save(insuranceAgent4);
    }
}
