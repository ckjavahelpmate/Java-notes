package oops.C13_string;

public class Demo
{
    public static void main(String[] args)
    {
        String s1 = "Java" ;
        String s2 = "Java" ;
        System.out.println( "s1 :: "+  s1 ); // Java
        System.out.println( "s2 :: "+  s2 ); // Java
        System.out.println("Comparing Using == : "+ ( s1 == s2 ) ); //true ==> compares Addresss
        System.out.println("====================================================");
        String s3  = new String("Hello") ;
        String s4  = new String("Hello") ;
        System.out.println("s3 :: "+ s3 ); // Hello
        System.out.println("s4 :: "+ s4 ); // Hello
        System.out.println("Comparing Using == "+ ( s3 == s4 )); // false ==> compares Address
        System.out.println("Comparing Using equals method : "+ s3.equals(s4) ); // true ==> compares values


    }
}




class  Student
{
    int id ;
    String name ;
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String toString()
    {
        return "Student [ id = " + id + ", name= "+ name +" ]" ;
    }
}