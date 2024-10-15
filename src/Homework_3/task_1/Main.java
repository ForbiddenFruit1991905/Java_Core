package Homework_3.task_1;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee("L", "V", "M", "engineer", "777", 120000, 1991);
//        System.out.println(employee);

        Employee employee1 = new Employee("L", "V", "M", "engineer", "777", 120000, 1991);
        Employee employee2 = new Employee("L", "D", "S", "engineer", "999", 250000, 1990);
        Employee employee3 = new Employee("B", "E", "U", "manager", "555", 190000, 1970);
        Employee employee4 = new Employee("P", "V", "N", "worker", "333", 120000, 1968);
        Employee employee5 = new Employee("M", "N", "B", "manager", "707", 170000, 1980);

        Employee[] coworkers = new Employee[5];
        coworkers[0] = employee1;
        coworkers[1] = employee2;
        coworkers[2] = employee3;
        coworkers[3] = employee4;
        coworkers[4] = employee5;
        for (Object coworker : coworkers) {
            System.out.println(coworker.toString());
        }
    }
}
