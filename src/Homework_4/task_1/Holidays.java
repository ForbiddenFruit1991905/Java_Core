package Homework_4.task_1;

import java.time.LocalDate;

public enum Holidays {
    NewYear {
        @Override
        public LocalDate getDateForYear(int year) {
            return LocalDate.of(year, 1, 1);
        }
    },
    WomenDay {
        @Override
        public LocalDate getDateForYear(int year) {
            return LocalDate.of(year, 3, 8);
        }
    },
    DayDefender {
        @Override
        public LocalDate getDateForYear(int year) {
            return LocalDate.of(year, 2, 23);
        }
    };

    public abstract LocalDate getDateForYear(int year);
}
