package oops.c3_constructors;

public class PatientForm {
    int pid;
    String name;
    int age;
    PatientForm() {
    }
    PatientForm(int age) {
        this();
        this.age = age;
    }
    PatientForm(int age, String name) {
        this(age);
        this.name = name;
    }
    PatientForm(int age, String name, int pid) {
        this(age, name);
        this.pid = pid;
    }
}




