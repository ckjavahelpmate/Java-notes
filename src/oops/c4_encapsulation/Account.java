package oops.c4_encapsulation;

public class Account
{
//    private state to restrict the access outside class
    private int acno ;
    private String name ;
    private  double bal ;
//          +
// getter and setters ==> to provide access
    public String getName()
    {
        return name ;
    }
    public int getAcno()
    {
        return acno;
    }
    public double getBal()
    {
        return bal ;
    }
    public void setName(String name)
    {
        this.name = name ;
    }

    public Account(int acno, String name, double bal)
    {
        this.acno = acno;
        this.name = name;
        this.bal = bal;
    }

    public void withdraw(double amt )
    {
        bal = bal - amt ;
        System.out.println( amt +"rs is debited from Account number "+ acno );
    }
    public void deposit(double amt )
    {
        bal = bal + amt ;
        System.out.println( amt +"rs is credited to Account number "+ acno );
        System.out.println("Balance ::  " + bal +"rs" );
    }
}
