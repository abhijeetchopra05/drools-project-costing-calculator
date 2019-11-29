package com.poc.drools.projectcostingcalculator;

import com.poc.drools.projectcostingcalculator.model.Costing;
import com.poc.drools.projectcostingcalculator.model.Project;
import com.poc.drools.projectcostingcalculator.service.ProjectCostCalculationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ProjectCostingCalculatorApplicationTests {

    @Autowired
    ProjectCostCalculationService projectCostCalculationService;

    @Test
    void totalHoursLessThanEstimatedHours() {
        Project project = new Project();
        project.setAmHours(10L);
        project.setDmHours(20L);
        project.setTlHours(30L);
        project.setDevelopersHours(50L);
        project.setAmUnits(100L);
        project.setDmUnits(80L);
        project.setTlUnits(50L);
        project.setDevelopersUnits(20L);
        project.setEstimatedHours(150L);

        Costing costing = projectCostCalculationService.calculateCost(project);

        Assertions.assertEquals(false,costing.getHoursOverhead());

        System.out.println(costing.getProjectCost());

    }

    @Test
    void totalHoursMoreThanEstimatedHours() {
        Project project = new Project();
        project.setAmHours(10L);
        project.setDmHours(20L);
        project.setTlHours(30L);
        project.setDevelopersHours(50L);
        project.setAmUnits(100L);
        project.setDmUnits(80L);
        project.setTlUnits(50L);
        project.setDevelopersUnits(20L);
        project.setEstimatedHours(90L);

        Costing costing = projectCostCalculationService.calculateCost(project);

        Assertions.assertEquals(true,costing.getHoursOverhead());
        System.out.println(costing.getProjectCost());

    }

}
