package com.poc.drools.projectcostingcalculator.model;

import java.util.List;

public class Project {

    private User accountManager;

    private User deliveryManager;

    private User teamLead;

    private List<User> developers;

    private Long amHours;

    private Long dmHours;

    private Long tlHours;

    private Long developersHours;

    private Long amUnits;

    private Long dmUnits;

    private Long tlUnits;

    private Long developersUnits;

    private Long cost;

    private Long estimatedHours;

    public Long getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(Long estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public User getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(User accountManager) {
        this.accountManager = accountManager;
    }

    public User getDeliveryManager() {
        return deliveryManager;
    }

    public void setDeliveryManager(User deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

    public User getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(User teamLead) {
        this.teamLead = teamLead;
    }

    public List<User> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<User> developers) {
        this.developers = developers;
    }

    public Long getAmHours() {
        return amHours;
    }

    public void setAmHours(Long amHours) {
        this.amHours = amHours;
    }

    public Long getDmHours() {
        return dmHours;
    }

    public void setDmHours(Long dmHours) {
        this.dmHours = dmHours;
    }

    public Long getTlHours() {
        return tlHours;
    }

    public void setTlHours(Long tlHours) {
        this.tlHours = tlHours;
    }

    public Long getDevelopersHours() {
        return developersHours;
    }

    public void setDevelopersHours(Long developersHours) {
        this.developersHours = developersHours;
    }

    public Long getAmUnits() {
        return amUnits;
    }

    public void setAmUnits(Long amUnits) {
        this.amUnits = amUnits;
    }

    public Long getDmUnits() {
        return dmUnits;
    }

    public void setDmUnits(Long dmUnits) {
        this.dmUnits = dmUnits;
    }

    public Long getTlUnits() {
        return tlUnits;
    }

    public void setTlUnits(Long tlUnits) {
        this.tlUnits = tlUnits;
    }

    public Long getDevelopersUnits() {
        return developersUnits;
    }

    public void setDevelopersUnits(Long developersUnits) {
        this.developersUnits = developersUnits;
    }
}
