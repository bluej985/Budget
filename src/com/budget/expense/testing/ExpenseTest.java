package com.budget.expense.testing;

import com.budget.expense.Category;
import com.budget.expense.Expense;
import com.budget.expense.Frequency;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ExpenseTest {

    @org.junit.Test
    public void toStringTest() {

        // Arrange
        String expected = "Expense name: Electric Frequency: MONTHLY Category: UTILITIES Amount: 250.0";

        // Act
        Expense expense = new Expense("Electric", 250, Frequency.MONTHLY, Category.UTILITIES);
        String actual = expense.toString();

        // Assert
        Assert.assertEquals(expected, actual);
    }
}