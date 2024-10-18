
package Homework_4.task_1;

import java.time.LocalDate;

public enum Holidays {
    NewYear {
        @Override
        public LocalDate getDateForYear(int year) {
            return LocalDate.of(year, 1, 1);
        }
        @Override
        public String getGreeting() {
            return "Поздравляем с Новым Годом!";
        }
    },
    WomenDay {
        @Override
        public LocalDate getDateForYear(int year) {
            return LocalDate.of(year, 3, 8);
        }
        @Override
        public String getGreeting() {
            return "Поздравляем с Международным женским днем!";
        }
    },
    DayDefender {
        @Override
        public LocalDate getDateForYear(int year) {
            return LocalDate.of(year, 2, 23);
        }
        @Override
        public String getGreeting() {
            return "Поздравляем с Днем защитника Отечества!";
        }
    };

    public abstract LocalDate getDateForYear(int year);

    public abstract String getGreeting();
}

