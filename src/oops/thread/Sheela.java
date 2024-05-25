package oops.thread;

public class Sheela extends Thread {
    public void run() {
        deposit();
    }
    public static void main(String[] args) {
        System.out.println("Thread Id :: " + Thread.currentThread().getId());
        System.out.println("Thread Name :: " + Thread.currentThread().getName());
        System.out.println("Thread Priority :: " + Thread.currentThread().getPriority());
        withdraw();
        Thread sheela = new Sheela();
        sheela.setName("sheela Thread");
        sheela.start(); // main() ==> start() ==> will create new thread instance ==> run() ==> thread will join thread Queue
//        Thread Scheduler will decide which thread has to be Executed
    }
    public static void withdraw() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Withdraw is happening");
        }
        System.out.println("Withdraw function is Executed by Thread ");
        System.out.println("Thread Id :: " + Thread.currentThread().getId());
        System.out.println("Thread Name :: " + Thread.currentThread().getName());
        System.out.println("Thread Priority :: " + Thread.currentThread().getPriority());
    }
    public static void deposit() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("deposit is happening");
        }
        System.out.println("Deposit function is Executed by Thread ");
        System.out.println("Thread Id :: " + Thread.currentThread().getId());
        System.out.println("Thread Name :: " + Thread.currentThread().getName());
        System.out.println("Thread Priority :: " + Thread.currentThread().getPriority());
    }

}
