package oops.C13_string;

public class Immutable {
    public static void main(String[] args) {
//      String class
//      =============================================================================
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2); // false ==> Address
        System.out.println(s1.equals(s2)); // true ==> Values
//      StringBuilder class
//      =============================================================================
        StringBuilder sb1 = new StringBuilder("sheela");
        StringBuilder sb2 = new StringBuilder("sheela");
        System.out.println(sb1 == sb2); // false ==> Address
        System.out.println(sb1.equals(sb2)); // false ==> Address

        System.out.println("=============================================");
//      How to Compare StringBuilder Objects values
//      We must convert StringBuilder Object into String Object
        String convertedS1 = sb1.toString();
        String convertedS2 = sb2.toString();
        System.out.println("converted s1 : " + convertedS1);
        System.out.println("converted s2 : " + convertedS2);
        System.out.println(convertedS1.equals(convertedS2)); // true
    }
}
