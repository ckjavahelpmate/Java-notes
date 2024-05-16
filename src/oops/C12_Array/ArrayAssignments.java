package oops.C12_Array;

import java.util.Scanner;

/*
   1.WAJPT read 5 integer values from user and store in array and print in reverse order
   2.WAJPT find sum of Array elements.
   3.WAJPT find sum even elements of array.
   4.WAJPT find max element in the array
   5.WAJPT create 5 employees with states id, name , salary and store all the employees in array and print the employee details of allen.
   6.WAJPT find total cost spent on employees.
   7.WAJPT print employee details who is getting higher salary.
   8.WAJPT find the average salary spent by the company.
*/
public class ArrayAssignments {
    //Inner class
    private static class Employee {
        int id = 101;
        String name;
        double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        int[] values = { 4, 1, 5, 3, 2 };
//        System.out.println(sumOfArrayElements(values));
//        System.out.println(sumOfEvenElements(values));
//        System.out.println( max(values));
        Employee[] emps = {
                new Employee(101, "Sheela", 25000),
                new Employee(102, "Mala", 27000),
                new Employee(103, "Urmila", 19000),
                new Employee(104, "Allen", 15000),
                new Employee(105, "Laila", 18000)
        };

//        printEmploteeDetails(emps , "Sheela");
//        System.out.println(totalCost(emps));
//        detailsOfHighestsalaryEmployee(emps);
        System.out.println(  averageCost(emps) );
    }

    //     1.WAJPT read 5 integer values from user and store in array and print in reverse order
    public static void task1() {
        System.out.println("enter 1st value");
        int v1 = sc.nextInt();
        System.out.println("enter 2st value");
        int v2 = sc.nextInt();
        System.out.println("enter 3rd value");
        int v3 = sc.nextInt();
        System.out.println("enter 4th value");
        int v4 = sc.nextInt();
        System.out.println("enter 5th value");
        int v5 = sc.nextInt();
        int[] values = {v1, v2, v3, v4, v5};

        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + ", ");
        }
    }

    //      2.WAJPT find sum of Array elements.
    public static int sumOfArrayElements(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    //      3.WAJPT find sum even elements of array.
    public static int sumOfEvenElements(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                sum = sum + values[i];
            }
        }
        return sum;
    }

    //   4.WAJPT find max element in the array
    public static int max(int[] values)   //values = { 4, 1, 5, 3, 2}
    {
        int max = values[0]; // max = 5

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) // 2 > 5
            {
                max = values[i];
            }
        }
        return max;
    }

    //  5.WAJPT create 5 employees with states id, name , salary and store all the employees in array and print the employee details of allen.
    public static void printEmploteeDetails(Employee[] emps, String name) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].name == name) {
                System.out.println(emps[i].id);
                System.out.println(emps[i].name);
                System.out.println(emps[i].salary);
                return;
            }
        }
        System.out.println(name + " is not present in database");
    }

    // 6.WAJPT find total cost spent on employees.
    public static double totalCost(Employee[] emps) {
        double sum = 0;
        for (int i = 0; i < emps.length; i++) {
            sum = sum + emps[i].salary;
        }
        return sum;
    }

    //    7.WAJPT print employee details who is getting higher salary.
    public static void detailsOfHighestsalaryEmployee(Employee[] emps)   //values = { 4, 1, 5, 3, 2}
    {
        double max = emps[0].salary; // max = 5
        int index = 0;

        for (int i = 0; i < emps.length; i++) {
            if (emps[i].salary > max) // 2 > 5
            {
                max = emps[i].salary;
                index = i;
            }
        }
        System.out.println(emps[index].id);
        System.out.println(emps[index].name);
        System.out.println(emps[index].salary);
    }

    //     8.WAJPT find the average salary spent by the company.
    public static double averageCost(Employee[] emps)
    {
        return  totalCost(emps) / emps.length ;
    }

}

