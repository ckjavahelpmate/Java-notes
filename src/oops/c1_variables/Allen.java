package oops.c1_variables;

import oops.c2_methods.Sheela ;
import oops.c2_methods.Mala ;

public class Allen {
    public static void main(String[] args) {
        System.out.println("From allen class");

//        Accessing By Fully qualified name
        System.out.println( "Urmila ID : "+ oops.c2_methods.Urmila.id );

//       Accessing By importing
        System.out.println("Mala id :: "+ Mala.id );
        System.out.println("Name :: "+ Sheela.name);
        System.out.println("id :: "+ Sheela.id);
        System.out.println("age :: "+ Sheela.age);
    }
}
