package com.poc.drools.projectcostingcalculator.model;

public class Costing {

    private Long projectCost;

    private Boolean isHoursOverhead;

    public Long getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(Long projectCost) {
        this.projectCost = projectCost;
    }

    public Boolean getHoursOverhead() {
        return isHoursOverhead;
    }

    public void setHoursOverhead(Boolean hoursOverhead) {
        isHoursOverhead = hoursOverhead;
    }
}
