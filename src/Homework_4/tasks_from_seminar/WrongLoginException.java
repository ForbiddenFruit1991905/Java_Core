package Homework_4.tasks_from_seminar;

public class WrongLoginException extends NumberFormatException{
    private int curLength;
    public WrongLoginException(int curLength) {
         super();
         this.curLength = curLength;
    }

    @Override
    public String getMessage() {
        return "Your current login has given " +
                curLength + " symbols" +
                ", expected less than 20.\n";
    }

}
