package Homework_4.tasks_from_seminar;

public class task_1 {
    /*
    Задача: Проверка логина и пароля
    1. Создать статический метод который принимает на вход три
    параметра: login, password и confirmPassword.
    2. Длина login должна быть меньше 20 символов. Если login не
    соответствует этим требованиям, необходимо выбросить
    WrongLoginException.
    3. Длина password должна быть не меньше 20 символов. Также password
    и confirmPassword должны быть равны. Если password не
    соответствует этим требованиям, необходимо выбросить
    WrongPasswordException.
    4. WrongPasswordException и WrongLoginException - пользовательские
    классы исключения с двумя конструкторами – один по умолчанию,
    второй принимает сообщение исключения и передает его в
    конструктор класса Exception.
    5. В основном классе программы необходимо по-разному обработать
    исключения.
    6. Метод возвращает true, если значения верны или false в другом
    случае.

     */
    private String login;
    private String password;
    private String confirmPassword;

    public task_1(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static boolean checkPass(String login, String password, String confirmPassword) {
        boolean flag = password.equals(confirmPassword);
        if (login.length() >= 20) {
            throw new WrongLoginException(login.length());
        } else if (password.length() < 20 || !flag) {
            throw new WrongPasswordException(password.length(), flag);
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword;
    }
}
