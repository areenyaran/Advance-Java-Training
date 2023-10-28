package company;

public class ManagerBudgetReport implements BudgetReportGenerator<Manager> {
    @Override
    public void generateBudgetReport(Manager admin) {

        System.out.println("company.Manager Budget Report: \n" + admin.getInfo());

        BudgetCalculator calculator = new ManagerBudgetCalculator();
        double totalBudget = calculator.calculateBudget(admin);

        System.out.println("Total Budget --> $" + totalBudget + "\n");
        System.out.println("================================================================");
    }
}
