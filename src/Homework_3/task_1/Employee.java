package Homework_3.task_1;

import java.time.LocalDate;

public class Employee {
    /*
    Задача: Создать класс "Сотрудник" с полями: ФИО, должность, телефон,
    зарплата, возраст.
     */
    private final int currentYear = LocalDate.now().getYear();
    private static int empID = 0;
    String lastname;
    String firstname;
    String middlename;
    String position;
    String phonenumber;
    int salary;
    int birth_year;
    public int id;

    public Employee(String lastname, String firstname, String middlename, String position, String phonenumber, int salary, int birth_year) {
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

    public int getBirth_year() {
        return birth_year;
    }

    public int getAge() {
        return currentYear - birth_year;
    }

    public void higherSalary() {
        if (getAge() >= 45) {
            salary += 5000;
        }
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

