import com.budget.expense.*;
import com.budget.expense.com.budge.income.Income;
import com.budget.expense.com.budge.income.Incomes;

public class Test {
    public static void main(String[] args) {
        Expenses expenses = new Expenses();

        // Create expenses - future replace with loading from file and then from database
        expenses.addExpense(new Expense("Electric", 250, Frequency.MONTHLY, Category.UTILITIES));
        expenses.addExpense(new Expense("Lawn", 115, Frequency.MONTHLY, Category.SERIVCE));

        // Create income - future replace with loading from file and then from database
        Incomes incomes = new Incomes();
        incomes.addIncome(new Income("Jeremy", 3199.82, Frequency.SEMI_MONTHLY, Category.INCOME));

        for (Expense e : expenses) {
            System.out.println(e);
        }

        for (Income income: incomes) {
            System.out.println(income);
        }

        // Print total expenses
        System.out.println(expenses.getTotal());

        // Print total income
        System.out.println(incomes.getTotal());

        // Print balance
        System.out.println(incomes.getTotal()-expenses.getTotal());

    }
}
