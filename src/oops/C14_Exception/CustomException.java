package oops.C14_Exception;
import java.util.Scanner;
/*
this() ==> to call current constructor
super() ==> to call parent class constructor
 */
class SalaryException extends RuntimeException {
    public SalaryException(String msg) {
        super(msg);
    }
}
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter your id");
        int id = sc.nextInt();
        System.out.println("Enter Your salary");
        double sal = -888 ;
        if (sal <= 0) {
            throw new SalaryException("Negative Salary");
        }
        Employee e = new Employee(id, name, sal);
        System.out.println(e);
    }
}
class Employee {
    int id;
    String name;
    double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}