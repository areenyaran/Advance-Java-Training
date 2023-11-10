package company;

public class Staff implements iUser {
    private final int id;
    private final String name;
    private final int age;
    private double hourlyRate;
    private double totalHours;

    public Staff(int id, String name, int age, double hourlyRate, double totalHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
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
