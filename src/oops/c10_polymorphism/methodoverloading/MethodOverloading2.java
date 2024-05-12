package oops.c10_polymorphism.methodoverloading;

public class MethodOverloading2
{
    public static void main(String[] args)
    {
        int a = 65 ;
        sita(  (char) a  ) ;
    }

    public static void sita(char data) {
        System.out.println("char :: " + data);
    }
    public static void sita(double data) {
        System.out.println("double :: " + data);
    }
    public static void sita(int data) {
        System.out.println("int :: " + data);
    }
    public static void sita(long data) {
        System.out.println("long :: " + data);
    }
}
