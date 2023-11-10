package company;

class ManagerBudgetCalculator implements BudgetCalculator<Manager> {
    @Override
    public double calculateBudget(Manager manager) {
        double totalBudget = manager.getTotalHours() * manager.getHourlyRate();

        for (Staff staff : manager.getStaff()) {
            totalBudget += staff.getHourlyRate() * staff.getTotalHours();
        }

        return totalBudget;
    }
}