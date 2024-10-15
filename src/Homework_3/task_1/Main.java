package Homework_3.task_1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("L", "V", "M", "engineer", "777", 120000, 1991);
        Employee employee2 = new Employee("L", "D", "S", "engineer", "999", 250000, 1990);
        Employee employee3 = new Employee("B", "E", "U", "manager", "555", 190000, 1968);
        Employee employee4 = new Employee("P", "V", "N", "worker", "333", 120000, 1968);
        Employee employee5 = new Employee("M", "N", "B", "manager", "707", 270000, 1980);
        Employee employee6 = new TopManager("M", "N", "B", "manager", "707", 290000, 1975);

        Employee[] coworkers = new Employee[6];
        coworkers[0] = employee1;
        coworkers[1] = employee2;
        coworkers[2] = employee3;
        coworkers[3] = employee4;
        coworkers[4] = employee5;
        coworkers[5] = employee6;

// Проверка созданного массива из 5 сотрудников
//        for (Object coworker : coworkers) {
//            System.out.println(coworker.toString());
//        }

// Проверка вызова методов на определение среднего возраста всех сотрудников + средняя зарплата
        System.out.println("Average age: " + employee1.avrAges(coworkers) + "\n" + "Average salary: " + employee1.avrSalary(coworkers));
        
// Проверка прототипа компаратора (сравнивала по возрасту (без дат))
        if (employee1.compare(employee3, employee2) < 0) {
            System.out.println("Сотрудник " + employee3.getFirstname() + " младше, чем " + employee2.getFirstname());
        } else if (employee1.compare(employee3, employee2) > 0) {
            System.out.println("Сотрудник " + employee3.getFirstname() + " старше, чем " + employee2.getFirstname());
        } else {
            System.out.println("Сотрудники одного возраста");
        }

// Проверка метода повышения ЗП на 5000 при условии, что возраст сотрудника больше 45
        TopManager topManager = new TopManager("M", "N", "B", "manager", "707", 290000, 1975);
        topManager.higherSalary(coworkers);

        for (Employee employee : coworkers) {
            System.out.println(employee);
        }

        }

    }
