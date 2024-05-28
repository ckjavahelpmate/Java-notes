package oops.C16_Collection;

import java.util.Scanner;
/*
1.Array Size is Fixed it is static memory allocation.
2.We do not have functions  to perform Create/Read/Update/Delete Operation
 */
public class EmployeeApp {
    static Employee[] emps = new Employee[0]  ;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Details Management App");
        System.out.println("==========================================");
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.println("Select an Option");
                System.out.println("==========================================");
                System.out.println("Press 1 for Adding Employee to Database");
                System.out.println("Press 2 for See List of Employees");
                System.out.println("Press 3 for Deleting Employee from Database");
                System.out.println("Press 4 to Exit App");
                System.out.println("==========================================");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Employee id");
                        int id = sc.nextInt() ;
                        System.out.println("Enter your name");
                        String name = sc.next();
                        System.out.println("Enter your salary");
                        double sal = sc.nextDouble();
                        Employee e = new Employee(id, name, sal );
                        addEmplyee(e);
                        break;
                    case 2:
                        listOfEmployee();
                        break;
                    case 3:
                        System.out.println("Enter id of Employee to be Deleted from Database");
                        int tempId = sc.nextInt() ;
                        deleteEmployee(tempId);
                        break;
                    case 4:
                        repeat = false;
                        break;
                    default:
                        System.out.println("Invalid Selection");
                }
                System.out.println("=======================================");
            }
            catch (Exception e)
            {
                System.out.println("Something went Wrong...Please Try again..."); sc.nextLine() ;
            }
        }
        System.out.println("Thanks for Using Employee Details Management App");
    }
    public static void addEmplyee(Employee e)
    {
       Employee[] temp = new Employee[ emps.length + 1 ]; // temp ==> [ employee@100abc ]
        for( int i =0 ; i < emps.length ; i++ )
        {
            temp[i] = emps[i] ;
        }
        temp[ temp.length-1 ] = e ;
       emps = temp ;
        System.out.println("Employee with Id "+ e.id + " is added to Database");
        System.out.println("=================================================");

    }
    public static void listOfEmployee()
    {
        System.out.println("List of Employees in Database");
        System.out.println("=============================");
        for( int i = 0; i < emps.length ; i++ )
        {
            System.out.println( emps[i] );
        }
        System.out.println("=============================");
    }
    public static void deleteEmployee(int id)
    {
        // write your code here
    }
}
class Employee
{
    int id ;
    String name ;
    double sal ;

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