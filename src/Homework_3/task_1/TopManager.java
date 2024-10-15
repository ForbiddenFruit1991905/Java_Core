package Homework_3.task_1;

public class TopManager extends Employee{
    public TopManager(String lastname, String firstname, String middlename, String position, String phonenumber, int salary, int birth_year) {
        super(lastname, firstname, middlename, position, phonenumber, salary, birth_year);
    }

    /*
    Опишите класс руководителя, наследник от сотрудника. Перенесите статический
    метод повышения зарплаты в класс руководителя, модифицируйте метод таким
    образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В
    основной программе создайте руководителя и поместите его в общий массив
    сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата
    руководителя не повысилась.
     */

//    public static void higherSalary(Employee[] employee, int amount) {
//        for (Employee employees : employee) {
//            if (getAge() >= 45 && !(employees.getPosition().equals("manager")) /*!(employees instanceof TopManager)*/) {
//                salary += amount;
//            }
//        }
//
//    }

    public void higherSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getAge() >= 45 && !employee.position.equals("manager")) {
                employee.salary += 5000;
            }
        }
    }
}
