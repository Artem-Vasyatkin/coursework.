import java.util.Objects;

public class Employee {
    private static int idCounter = 0;

    private int id;
    private String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Зарплата не может быть ниже 0");
            return;

        }
        this.salary = salary;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            return;
        }
        this.department = department;
    }

    public String toString() {
        return "ID: " + id + " \nФ.И.О.: " + fullName +
                " \nОтдел: " + department + " \nЗарплата: " + salary;
    }

    public String toString(int name) {
        return "\nФ.И.О.:" + name;
    }
    public boolean equals(Object i) {
        if (i == this) {
            return true;
        }
        if (i == null || this.getClass() != i.getClass()) {
            return false;
        }
        Employee employee = (Employee) i;
        return fullName.equals(employee.fullName) && salary == employee.salary
                && department == employee.department && id == employee.id;
    }

    public int hashCode() {
        return Objects.hash(fullName, salary, department, id);
    }
}

