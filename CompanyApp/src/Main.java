import company.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company ArCompany = new Company("Ar");

        Director director1 = new Director(1, "Director Areen", 45, 40.0, 200.0);
        Manager manager1 = new Manager(3, "Manager Ahmad", 35, 30.0, 180.0);
        Manager manager2 = new Manager(4, "Manager Malek", 38, 32.0, 175.0);
        Manager manager3 = new Manager(5, "Manager Zaid", 40, 33.5, 185.0);
        Staff staff1 = new Staff(6, "Staff Rayan", 25, 20.0, 160.0);
        Staff staff2 = new Staff(7, "Staff Sarah", 28, 22.0, 170.0);
        Staff staff3 = new Staff(8, "Staff Yasmeen", 27, 21.5, 165.0);
        Staff staff4 = new Staff(9, "Staff Sameera", 23, 19.0, 155.0);
        Staff staff5 = new Staff(10, "Staff Hala", 30, 25.0, 180.0);

        ArCompany.addDirectors(director1);
        ArCompany.addManagers(manager1, manager2, manager3);
        ArCompany.addStaff(staff1, staff2, staff3, staff4, staff5);

        director1.addManagers(manager1, manager2, manager3);
        director1.addStaff(staff1, staff2, staff3, staff4, staff5);
        director1.removeStaff(staff1);

        manager1.addStaff(staff1, staff2, staff3, staff4, staff5);
        manager2.addStaff(staff3, staff4);
        manager3.addStaff(staff5);

        DirectorBudgetReport directorBudgetReport = new DirectorBudgetReport();
        for (Director director : ArCompany.getDirectors()) {
            directorBudgetReport.generateBudgetReport(director);
        }

        ManagerBudgetReport managerBudgetReport = new ManagerBudgetReport();
        for (Manager manager : ArCompany.getManagers()) {
            managerBudgetReport.generateBudgetReport(manager);
        }

        StaffReport staffReport = new StaffReport();
        for (Manager manager : ArCompany.getManagers()) {
            staffReport.generateStaffReport(manager);
        }
        for (Director director : ArCompany.getDirectors()) {
            staffReport.generateStaffReport(director);
        }

        Database database = Database.getInstance("127.0.0:44433/Company1");
        Database database2 = Database.getInstance("127.0.0:44433/Company2");

        DBExecutor executor = new DBExecutor(database);

        System.out.println("Test 1:");
        executor.executeQuery("SELECT * FROM managers");
        List<Manager> managers = ArCompany.getManagers();
        for (Manager manager : managers) {
            System.out.println(manager.getInfo());
        }

        System.out.println("Test 2:");
        if (database == database2) {
            System.out.println("Both instances are the same (Singleton pattern check is true)");
        } else {
            System.out.println("Instances are different");
        }
    }
}
