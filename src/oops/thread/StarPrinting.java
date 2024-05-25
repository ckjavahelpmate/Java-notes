package oops.thread;

public class StarPrinting
{
    public static void main(String[] args)
    {
        System.out.println("Hi");
        for (int i =1 ; i <= 25 ; i++)
        {
            System.out.print( "* " );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


//        Code for Opening website
//        Thread.sleep(10000)
//        Enter Username and password

    }
}
