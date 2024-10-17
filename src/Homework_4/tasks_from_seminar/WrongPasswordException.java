package Homework_4.tasks_from_seminar;

public class WrongPasswordException extends NumberFormatException{
    private int curLength;
    private boolean matchPass;

    public WrongPasswordException(int curLength, boolean matchPass) {
        super();
        this.curLength = curLength;
        this.matchPass = matchPass;
    }
    /*
    Длина password должна быть меньше 20 символов. Также password
    и confirmPassword должны быть равны. Если password не
    соответствует этим требованиям, необходимо выбросить
    WrongPasswordException.
     */
    @Override
    public String getMessage() {
        return String.format("Password must be more than 20 symbols, fixed %d. Also password must match conformation password in its length: %b\n", curLength, matchPass);
    }
}
