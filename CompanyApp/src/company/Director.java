package company;

import java.util.ArrayList;
import java.util.List;

public class Director implements iUser, iAdmin {
    private final List<Manager> managers = new ArrayList<>();
    private final List<Staff> staff = new ArrayList<>();
    private int id;
    private String name;
    private int age;
    private double hourlyRate;
    private double totalHours;

    public Director(int id, String name, int age, double hourlyRate, double totalHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    public void addManagers(Manager... newManagers) {
        for (Manager manager : newManagers) {
            managers.add(manager);
        }
    }

    public void removeManagers(Manager... managersToRemove) {
        for (Manager manager : managersToRemove) {
            managers.remove(manager);
        }
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void addStaff(Staff... newStaffMembers) {
        for (Staff staffMember : newStaffMembers) {
            staff.add(staffMember);
        }
    }

    public void removeStaff(Staff... staffMembersToRemove) {
        for (Staff staffMember : staffMembersToRemove) {
            staff.remove(staffMember);
        }
    }

    public List<Staff> getStaff() {
        return staff;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Hourly Rate: " + hourlyRate +
                ", Total Completed Hours: " + totalHours;
    }
}
