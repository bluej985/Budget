package com.budget.expense;

public class Expense {

    private String name;

    public double getAmount() {
        return amount;
    }

    private double amount;
    private Frequency frequency;
    private Category category;

    public Expense(String name, double amount, Frequency frequency, Category category) {
        this.name = name;
        this.amount = amount;
        this.frequency = frequency;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Expense name: " + name + " Frequency: " + frequency + " Category: " + category + " Amount: " + amount);
    }
}
