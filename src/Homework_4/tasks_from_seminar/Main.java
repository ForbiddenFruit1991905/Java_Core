package Homework_4.tasks_from_seminar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter login:");
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();

        System.out.println("Enter password:");
        String password = sc.nextLine();

        System.out.println("Enter confirmation password:");
        String confPassword = sc.nextLine();

        try {
            System.out.println(task_1.checkPass(login, password, confPassword));
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
