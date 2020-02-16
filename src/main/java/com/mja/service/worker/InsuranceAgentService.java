package com.mja.service.worker;

import com.mja.model.worker.InsuranceAgent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InsuranceAgentService {

    InsuranceAgent save(InsuranceAgent insuranceAgent);

    List<InsuranceAgent> removeById(Long id);

    List<InsuranceAgent> findAll();
}
