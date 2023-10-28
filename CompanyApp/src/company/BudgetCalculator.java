package company;

interface BudgetCalculator<T> {
    double calculateBudget(T admin);
}