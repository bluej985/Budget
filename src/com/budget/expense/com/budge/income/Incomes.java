package com.budget.expense.com.budge.income;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Incomes implements Iterable<Income> {

    private final List<Income> incomes = new ArrayList<>();

    public double getTotal() {
        return total;
    }

    private double total;

    public void addIncome(Income income) {
        incomes.add(income);
        total += income.getAmount();
    }

    public Iterator<Income> iterator() {return incomes.iterator();}
}
