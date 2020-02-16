package com.mja.dao.worker;

import com.mja.model.worker.InsuranceAgent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsuranceAgentDao extends CrudRepository<InsuranceAgent, Long> {

    InsuranceAgent save(InsuranceAgent insuranceAgent);

    List<InsuranceAgent> removeById(Long id);

    List<InsuranceAgent> findAll();

}
