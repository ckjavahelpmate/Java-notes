package oops.C14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        App3.leela();
    }
}
class App3 {
    public static void leela() {
        App2.ram();
    }
}
class App2 {
    public static void ram() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Division App");
            System.out.println("=======================");
            System.out.println("Enter 1st Number");
            int a = sc.nextInt();
            System.out.println("Enter 2nd Number");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Reslut of " + a + " / " + b + " is " + res);
            System.out.println("Thank you for Using Division App");
        } catch (ArithmeticException obj) {
            System.out.println("Zero not allowed as 2nd number");
        }
        System.out.println("Bye Bye");
    }
}

