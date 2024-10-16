package Homework_3.task_1;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    /*
    Задача: Создать класс "Сотрудник" с полями: ФИО, должность, телефон,
    зарплата, возраст.
     */
    private static final LocalDate currentDate = LocalDate.now();
    private static int empID = 0;
    String lastname;
    String firstname;
    String middlename;
    String position;
    String phonenumber;
    int salary;
    LocalDate birth_year;
    public int id;

    public Employee(String lastname, String firstname, String middlename, String position, String phonenumber, int salary, LocalDate birth_year) {
        this.id = ++empID;
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.position = position;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.birth_year = birth_year;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getPosition() {
        return position;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getBirth_year() {
        return birth_year;
    }

    public int getAge() {
        return Period.between(birth_year, currentDate).getYears();
    }

    /*
    Создать метод, повышающий зарплату всем
    сотрудникам старше 45 лет на 5000.
     */

//    public void higherSalary() {
//        if (getAge() >= 45) {
//            salary += 5000;
//        }
//    }

    /*
    Написать методы (принимающие на вход массив сотрудников),
вычисляющие средний возраст и среднюю зарплату сотрудников, вывести
результаты работы в консоль.
     */

    public int avrAges(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getAge();
        }
        return sum/employees.length;
    }

    public int avrSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum/employees.length;
    }

    /*
    Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий
    две даты, представленные в виде трёх чисел гггг-мм-дд, без использования
    условного оператора.
     */

    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    @Override
    public String toString() {
        return
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", position='" + position + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                ", id=" + id;
    }

}

