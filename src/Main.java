
public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60000);
        employees[2] = new Employee("Николаев Николай Николаевич", 3, 70000);
        employees[3] = new Employee("Стасов Стас Стасович", 4, 80000);
        employees[4] = new Employee("Викторов Виктор Викторович", 5, 90000);
        employees[5] = new Employee("Русланов Руслан Русланович", 1, 100000);
        employees[6] = new Employee("Семенов Семен Семнович", 2, 110000);
        employees[7] = new Employee("Андреев Андрей Андреевич", 3, 120000);
        employees[8] = new Employee("Филипов Филип Филипович", 4, 130000);
        employees[9] = new Employee("Никитин Никита Никитьевич", 5, 140000);

        printAllEmployees();
        calculateSumSalaryExpenses();
        employeeLowersSalary();
        employeeHighestSalary();
        calculateAveragesSalary();
        findEmployeeAmount();
        printNamesEmployees();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static void calculateSumSalaryExpenses() {
        double expenses = 0.0;
        for (Employee employee : employees) {
            expenses += employee.getSalary();
        }
        System.out.println("\nСумма зарплат за месяц " + expenses);
    }

    public static void employeeLowersSalary() {
        int employeeLower = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[employeeLower].getSalary() > employees[i].getSalary()) {
                employeeLower = i;
            }
        }
        System.out.println("\nСотрудник с минимальной зарплатой: "
                + employees[employeeLower].getFullName());
    }

    public static void employeeHighestSalary() {
        int employeeLower = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[employeeLower].getSalary() < employees[i].getSalary()) {
                employeeLower = i;
            }
        }
        System.out.println("\nСотрудник с максимальной зарплатой: "
                + employees[employeeLower].getFullName());
    }

    public static void calculateAveragesSalary () {
        double totalSalary = 0.0;
        int numberOfEmployees = employees.length;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        double averageSalary = totalSalary / numberOfEmployees;
        System.out.println("\n" + averageSalary);
    }

    public static void findEmployeeAmount() {
        int amount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                amount++;
            }
        }
        System.out.println("\nКолицество сотрудников: " + amount);
    }

    public static void printNamesEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}







