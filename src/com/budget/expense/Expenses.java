package com.budget.expense;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Expenses implements Iterable<Expense> {

    private final List<Expense> expenses = new ArrayList<>();

    public double getTotal() {
        return total;
    }

    private double total;

    public void addExpense(Expense expense) {
        expenses.add(expense);
        total += expense.getAmount();
    }

    public Iterator<Expense> iterator() {return expenses.iterator();}
}
