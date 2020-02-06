package com.mja.service;

import com.mja.model.agent.InsuranceAgent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InsuranceAgentService {

    InsuranceAgent save(InsuranceAgent insuranceAgent);

    List<InsuranceAgent> removeById(Long id);

    List<InsuranceAgent> findAll();
}
