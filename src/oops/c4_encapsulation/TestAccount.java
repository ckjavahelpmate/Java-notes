package oops.c4_encapsulation;

public class TestAccount {

    public static void main(String[] args)
    {
    Account a1 = new Account( 12345 , "Sheela" , 5000) ;

        System.out.println( a1 );
        System.out.println( a1.getName() );
        System.out.println( a1.getAcno() );
        System.out.println( a1.getBal() );

        a1.setName("Unlucky girl");
        a1.deposit(100000);

        System.out.println( a1.getName() );

    }
}
