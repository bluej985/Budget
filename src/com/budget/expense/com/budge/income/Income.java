package com.budget.expense.com.budge.income;

import com.budget.expense.Category;
import com.budget.expense.Frequency;

public class Income {

    private String name;

    public double getAmount() {
        return amount;
    }

    private double amount;
    private Frequency frequency;
    private Category category;

    public Income(String name, double amount, Frequency frequency, Category category) {
        this.name = name;
        this.amount = amount;
        this.frequency = frequency;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Income name: " + name + " Frequency: " + frequency + " Category: " + category + " Amount: " + amount);
    }
}
