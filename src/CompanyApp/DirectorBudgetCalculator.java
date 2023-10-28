class DirectorBudgetCalculator implements BudgetCalculator<Director> {

    public double calculateBudget(Director director) {

        double totalBudget = director.getTotalHours() * director.getHourlyRate();

        for (Manager manager : director.getManagers()) {
            totalBudget += manager.getTotalHours() * manager.getHourlyRate();
        }

        for (Staff staff : director.getStaff()) {
            totalBudget += staff.getTotalHours() * staff.getHourlyRate();
        }


        return totalBudget;
    }
}