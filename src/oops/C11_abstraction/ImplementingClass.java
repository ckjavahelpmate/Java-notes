package oops.C11_abstraction;

public class ImplementingClass  extends Addition
{
    public  int addition(int a , int b)
    {
        int res = a + b ;
        return  res ;
    }
}


class  ImplementingClass2 implements Calci1 , calci2
{
    public int addition(int a, int b)
    {
        return  a * b ;
    }
    public int sub(int a, int b)
    {
        return  a * b ;
    }
}

