package Homework_4.task_1;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    /*
    1. В класс покупателя добавить перечисление с гендерами, добавить в сотрудника
    свойство “пол” со значением перечисления, добавить геттеры, сеттеры.
    2. Добавить перечисление с праздниками (нг, 08.03,23.02), в основной программе
    написать метод, принимающий массив сотрудников и поздравляющий всех
    сотрудников с новым годом, женщин с 08.03, мужчин с 23.02.
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
    Gender gender;
    Holidays holidays;

    public Employee(Gender gender, String lastname, String firstname, String middlename, String position, String phonenumber, int salary, LocalDate birth_year) {
        this.id = ++empID;
        this.gender = gender;
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.position = position;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.birth_year = birth_year;
    }

    public Employee(Holidays holidays) {
        this.holidays = holidays;
    }

    public Holidays getHolidays() {
        return holidays;
    }

    public Gender getGender() {
        return gender;
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

    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

//    public String getGreetings(Employee[] employees, Gender gender, LocalDate currentDate) {
//        String greetingMessage = "";
//        for (Employee employee : employees) {
//            if (employee.getGender() == gender.Female && currentDate.equals(holidays.WomenDay)) {
//                greetingMessage = "Поздравляем с Международным женским днем!";
//                break;
//            } else if (employee.getGender() == Gender.Male && currentDate.equals(holidays.DayDefender)) {
//                greetingMessage = "Поздравляем с днем защитника Отечества!";
//                break;
//            } else if (currentDate.equals(holidays.NewYear)) {
//                greetingMessage = "Поздравляем с Новым Годом!";
//                break;
//            }
//        }
//        return greetingMessage;
//    }

    public String getGreetings(Holidays holiday, LocalDate currentDate) {
        if (currentDate.equals(holiday.getDateForYear(currentDate.getYear()))) {
            System.out.println(holiday.getGreeting());
        }
        return "";
    }

    @Override
    public String toString() {
        return  "gender='" + gender +  '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", position='" + position + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                ", id=" + id;
    }

}




