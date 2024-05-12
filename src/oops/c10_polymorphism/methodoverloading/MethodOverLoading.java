package oops.c10_polymorphism.methodoverloading;

class Student {
    int id;
    String name;
    String pan;

    public Student(int id, String name, String pan) {
        this.id = id;
        this.name = name;
        this.pan = pan;
    }
}

public class MethodOverLoading {
    static Student s1 = new Student(101, "sheela", "abc100");
    static Student s2 = new Student(102, "mala", "abc200");

    public static void main(String[] args) {
        System.out.println("S1 :: " + s1);
        System.out.println("S2 :: " + s2);
        delete("mala");
        System.out.println("S1 :: " + s1);
        System.out.println("S2 :: " + s2);
    }
    public static void delete(int id) {
        if (s1.id == id) {
            s1 = null;
        } else if (s2.id == id) {
            s2 = null;
        }
        System.out.println("student deleted");
    }
    public static void delete(String name) {
        if (s1.name == name) {
            s1 = null;
        } else if (s2.name == name) {
            s2 = null;
        }
        System.out.println("student deleted");
    }
}
