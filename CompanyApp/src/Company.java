import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    public String name;
    private final List<Manager> managers;
    private final List<Director> directors;
    private final List<Staff> staff;

    public Company(String name) {
        this.name = name;
        this.managers = new ArrayList<>();
        this.directors = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    public void addManagers(Manager... newManagers) {
        Collections.addAll(managers, newManagers);
    }

    public void removeManagers(Manager... managersToRemove) {
        for (Manager manager : managersToRemove) {
            managers.remove(manager);
        }
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void addDirectors(Director... newDirectors) {
        Collections.addAll(directors, newDirectors);
    }

    public void removeDirectors(Director... directorsToRemove) {
        for (Director director : directorsToRemove) {
            directors.remove(director);
        }
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void addStaff(Staff... newStaffMembers) {
        Collections.addAll(staff, newStaffMembers);
    }

    public void removeStaff(Staff... staffMembersToRemove) {
        for (Staff staffMember : staffMembersToRemove) {
            staff.remove(staffMember);
        }
    }

    public List<Staff> getStaff() {
        return staff;
    }
}
