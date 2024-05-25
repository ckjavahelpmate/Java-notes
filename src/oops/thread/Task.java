package oops.thread;

import java.util.Scanner;

public class Task extends Thread {
    public void run() {
        singing();
    }
    public static void main(String[] args) {
        Task thread2 = new Task();
        thread2.start();
//      join() , yield() , wait() , notify() ==> InterThread communication functions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("enter your salary");
        double sal = sc.nextDouble();
        System.out.println("Name :: " + name);
        System.out.println("Age :: " + age);
        System.out.println("Salary :: " + sal);
    }
    public static void singing() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Macha baa ootakke hogona");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
