package oops.C12_Array;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CreateStudentArray {
    public static void main(String[] args) {
        Student[] x = {new Student(101, "Sheela"),
                new Student(102, "Mala"),
                new Student(103, "Urmila")
        };
        System.out.println("x :: " + x);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]); //
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i].id); //
            System.out.println(x[i].name); //
            System.out.println("==============");
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i].name == "Urmila") {
                System.out.println(x[i].id); //
                System.out.println(x[i].name); //
                System.out.println("==============");
            }
        }
    }
}

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

