import java.util.*;

class Employee {

    private int id;
    private String name;
    private String department;
    private int age;

    public Employee(int id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee : " + id + " - " + name + " - " + department + " - " + age;
    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        int nameCompare = e1.getName().compareTo(e2.getName());
        if (nameCompare != 0) {
            return nameCompare;
        }

        int deptCompare = e1.getDepartment().compareTo(e2.getDepartment());
        if (deptCompare != 0) {
            return deptCompare;
        }

        return Integer.compare(e1.getAge(), e2.getAge());
    }
}

public class TestSorting {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "aTestName", "dLastName", 34));
        employees.add(new Employee(2, "nTestName", "pLastName", 30));
        employees.add(new Employee(3, "kTestName", "sLastName", 31));
        employees.add(new Employee(4, "dTestName", "zLastName", 25));

        Collections.sort(employees, new EmployeeComparator());

        System.out.println(employees);
    }
}
