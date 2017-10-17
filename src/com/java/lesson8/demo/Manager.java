package com.java.lesson8.com.java.lesson8.demo;

public class Manager extends Employee {

    private Employee assistant;

    public Manager(Employee assistant) {
        this.assistant = assistant;
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    @Override
    public String getDetail() {
        return "Manager " + this.assistant.getDetail();
    }
}
