class DirectorBudgetReport implements BudgetReportGenerator<Director> {

    public void generateBudgetReport(Director admin) {

        System.out.println("Director Budget Report: \n" + admin.getInfo());

        BudgetCalculator calculator = new DirectorBudgetCalculator();
        double totalBudget = calculator.calculateBudget(admin);

        System.out.println("Total Budget --> $" + totalBudget + "\n");
        System.out.println("================================================================");
    }
}
