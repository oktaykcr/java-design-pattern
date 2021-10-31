package other.nullobject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFactory {

    private static List<String> employeeList = new ArrayList<>() {
        {
            add("Jane");
            add("John");
            add("Jake");
        }
    };

    public static Employee getEmployee(String name) {
        if(employeeList.contains(name)) {
            for (String employeeName:
                    employeeList) {
                if(employeeName.equals(name)) {
                    return new Manager(name);
                }
            }
        }

        return new NullEmployee();
    }
}
