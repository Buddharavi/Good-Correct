/**
 * Created by DhanaSM on 12-08-2016.
 **/
import java.io.*;
import java.util.*;

public abstract class Employee implements Comparable{
    private String firstName;
    private String lastName;
    private String middleName;
    private int salary;

    public Employee(String firstName, String middleName, String lastName, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //int avgSalary() {}
    public int compareTO(Employee compareEmp){
        int compareSal = compareEmp.getEmployeeSalary();
        return this.getEmployeeSalary()-compareSal;
    }
    public String getEmployeeFirstName() {
        return this.firstName;
    }

    public String getEmployeeMiddleName() {
        return this.middleName;
    }

    public String getEmployeeLastName() {
        return this.lastName;
    }

    public int getEmployeeSalary() {
        return this.salary;
    }
}
class Operations{
    public static void main(String[] args){
        ArrayList Employee=new ArrayList();
        Employee.add(new Employee("ravi", "kanth", "Buddha", 20000));
        Employee.add(new Employee("rav", "kant", "Buddh", 2000));
        Employee.add(new Employee("ra","kan","Budd",2000));
        Collections.sort(Employee);
    }
}

