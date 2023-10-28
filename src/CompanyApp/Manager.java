import java.util.ArrayList;
import java.util.List;

public class Manager implements iUser, iAdmin {
    private final List<Staff> staff = new ArrayList<>();
    private int id;
    private String name;
    private int age;
    private double hourlyRate;
    private double totalHours;

    public Manager(int id, String name, int age, double hourlyRate, double totalHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    public void addStaff(Staff... staffMembers) {
        for (Staff staffMember : staffMembers) {
            staff.add(staffMember);
        }
    }

    public void removeStaff(Staff... staffMembers) {
        for (Staff staffMember : staffMembers) {
            staff.remove(staffMember);
        }
    }

    public List<Staff> getStaff() {
        return staff;
    }

    // Implement the getter methods for the iUser interface
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
