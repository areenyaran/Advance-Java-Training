package company;

import java.util.List;

public interface iAdmin {

    double getHourlyRate();

    double getTotalHours();

    String getInfo();

    List<Staff> getStaff();
}