package org.launchcode.techjobs.mvc.controllers;

import java.util.HashMap;

public class TechJobsController {
    HashMap<String, Double> actionChoices = new HashMap<>();

    public TechJobsController(HashMap<String, Double> actionChoices) {
        this.actionChoices = actionChoices;
    }

    public HashMap<String, Double> getActionChoices() {
        return actionChoices;
    }

    public void setActionChoices(HashMap<String, Double> actionChoices) {
        this.actionChoices = actionChoices;
    }

    @Override
    public String toString() {
        return "TechJobsController{" +
                "actionChoices=" + actionChoices +
                '}';
    }
}
