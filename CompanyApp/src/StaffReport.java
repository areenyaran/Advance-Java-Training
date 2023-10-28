class StaffReport implements StaffReportGenerator<iAdmin> {
    @Override
    public void generateStaffReport(iAdmin admin) {
        System.out.println("List of Staff report: ");
        System.out.println("Admin information:\n" + admin.getInfo());
        System.out.println("The staff: ");
        admin.getStaff().forEach(staff -> System.out.println("\t" + staff.getInfo()));
        System.out.println("================================================================");
    }
}