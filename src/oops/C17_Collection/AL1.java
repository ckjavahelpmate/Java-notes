package oops.C17_Collection;

import java.util.ArrayList;

public class AL1
{
    public static void main(String[] args)
    {
//   Non-Generic Collection ==> Collection of heterogeneous Datatypes
        ArrayList al = new ArrayList() ; // al ==> [Object o1=Integer@100 ,Object o2=String@100 ,Object o3=Character@100, Object o4=Double@100 ]
        al.add(10) ; // Integer
        al.add("Sheela") ; // String
        al.add('h') ; //Character
        al.add(30.5) ; // Double
        System.out.println( al );

        int num = (Integer)al.get(0) ; // Can not convert Object to Integer implicitly

//   Generic Collection ==> Collection of Homogenous Data types
        ArrayList<Integer> al2 = new ArrayList<>() ; // al2 ==> [Integer o1=Integer@100 ,Integer o2=Integer@200 ,Integer o3=Integer@300, Integer o4=Integer@400 ]
        al2.add(10) ;
        al2.add(20) ;
        al2.add(30) ;
        al2.add(40) ;
        System.out.println( al2 );

        int num2 = al2.get(0) ;



    }

}
