package com.poc.drools.projectcostingcalculator.service;

import com.poc.drools.projectcostingcalculator.model.Costing;
import com.poc.drools.projectcostingcalculator.model.Project;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectCostCalculationService {

    private final KieContainer kieContainer;

    public ProjectCostCalculationService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Costing calculateCost(Project project) {
        KieSession kieSession = kieContainer.newKieSession();
        Costing costing = new Costing();
        kieSession.setGlobal("costing", costing);
        kieSession.insert(project);
        kieSession.fireAllRules();
        kieSession.dispose();
        return costing;
    }
}
