package other;

import org.junit.Test;
import other.nullobject.Employee;
import other.nullobject.EmployeeFactory;

public class NullObjectPatternTest {

    /**
     * OUTPUT:
     * John
     * Jake
     * Employee is not found!
     */
    @Test
    public void nullObjectPattern() {
        Employee employee = EmployeeFactory.getEmployee("John");
        Employee employee2 = EmployeeFactory.getEmployee("Jake");
        Employee employee3 = EmployeeFactory.getEmployee("Oktay");

        System.out.println(employee.getName());
        System.out.println(employee2.getName());
        System.out.println(employee3.getName());
    }
}
