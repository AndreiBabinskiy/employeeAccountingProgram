import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(5,"IT");
        Employee[] employees = new Employee[5];

        Employee employeeDirector = new Employee("Oleg", "Petrov",Position.director);
        employeeDirector.setSalary(1000);
        Employee employeeQA = new Employee("Katy", "Burak",Position.qa);
        employeeQA.setSalary(800);
        Employee employeeProgrammer = new Employee("Gleb","Huga",Position.programmer);
        employeeProgrammer.setSalary(750);
        department.setDirector(employeeDirector);

        Employee employeeFirstName = new Employee();
        employeeFirstName.setFirstName("Andrey");
        //employeeFirstName.setSalary(1);

        Employee employeeFirstLastName = new Employee();
        employeeFirstLastName.setFirstName("Peter");
        employeeFirstLastName.setLastName("Iskov");
        //employeeFirstLastName.setSalary(2);

        employees[0] = employeeDirector;
        employees[1] = employeeQA;
        employees[2] = employeeProgrammer;
        employees[3] = employeeFirstName;
        employees[4] = employeeFirstLastName;

        System.out.println("----------------------------------------------------------------------------------");
        /*for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }*/
        department.setStaff(employees);
        for(Employee employee : department.getStaff()) {
            System.out.println(employee);
        }
        System.out.println("----------------------------------------------------------------------------------");
        /*for (Employee employee : employees) {
            if(employee.getPosition() == "director") {
                System.out.println(employee);
            }
        }*/
        System.out.println("Информация о директоре -> " + department.getDirector());
        System.out.println("----------------------------------------------------------------------------------");
        for(Employee employee : employees){
            if(employee.getPosition() != Position.director){
                System.out.println(employee);
            }
        }
        System.out.println("-------------------------------minSalary-------------------------------------------");
        double minSalary = employeeDirector.getSalary();
        Employee employee1 = new Employee();
        for(Employee employee : employees) {
            if(employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employee1 = employee;
            }
        }
        System.out.println(employee1 + " -> Min Salary = " + minSalary);
        System.out.println("-------------------------------maxSalary-------------------------------------------");
        double maxSalary = employeeFirstName.getSalary();
        Employee employee2 = new Employee();
        for(Employee employee : employees) {
            if(employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employee2 = employee;
            }
        }
        System.out.println(employee2 + " -> Max Salary = " + maxSalary);
        System.out.println("----------------------------------------------------------------------------------");
        Employee[] copyEmployees = new Employee[5];
        copyEmployees[0] = employeeQA;
        copyEmployees[1] = employeeProgrammer;
        copyEmployees[2] = employeeFirstName;
        //copyEmployees[3] = employeeFirstLastName;
        //copyEmployees[4] = employeeDirector;
        copyEmployees = addEmployee(copyEmployees,employeeDirector);
        System.out.println("----------------------------------------------------------------------------------");
        for(Employee employee : copyEmployees){
            System.out.println(employee);
        }
        System.out.println("----------------------------------------------------------------------------------");
        department.setStaff(copyEmployees);
        double sumSalaryEmployee = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваши вложения в стартап: ");
        double startup = scanner.nextDouble();
        for(Employee employee : department.getStaff()){
            if(employee.getSalary() != 0) {
                sumSalaryEmployee = sumSalaryEmployee + department.calculateTotalSalary(employee);
            }
        }
        int result = ((int)startup - (int)sumSalaryEmployee) / 30;
        System.out.println("Сколько месяцев у вас есть, чтобы выстрелить на рынке до того, как вы обанкротитесь? -> = "
                + result + " мес");
    }
    public static Employee[] addEmployee(Employee[] employees, Employee director) {
        int employeeCount = 0;
        for(Employee employee : employees) {
            if(employee != null) {
                employeeCount++;
            }
        }
        if (employeeCount < 5) {
            System.out.println("Добавляем сотрудника Jojarda");
            for (int i = 0; i < employees.length; i++) {
                if(employees[i] == null) {
                    employees[i] = new Employee("Jojarda", Position.qa);
                    System.out.println("Добавление прошло успешно !!!");
                    employeeCount++;
                    break;
                }
            }
        } else {
            System.out.println("Добавление сотрудника невозможно !");
        }
        for(Employee employee : employees) {
            if(employee == director && director.getPosition() == Position.director) {
                System.out.println("Директор уже был добавлен !");
                break;
            }
        }
        if(employeeCount < 5) {
            System.out.println("Добавляем директора Nikolay");
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = new Employee("Nikolay", Position.director);
                    System.out.println("Добавление прошло успешно !!!");
                }
            }
        }
        return employees;
    }
}