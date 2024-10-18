package Homework_4.task_1;

import java.time.LocalDate;

public class TopManager extends Employee {
    public TopManager(Gender gender, String lastname, String firstname, String middlename, String position, String phonenumber, int salary, LocalDate birth_year) {
        super(gender, lastname, firstname, middlename, position, phonenumber, salary, birth_year);
    }

    public void higherSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getAge() >= 45 && !employee.position.equals("manager")) {
                employee.salary += 5000;
            }
        }
    }
}
