package oops.c6_isArelationship;

public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        WAV3 v3 = new WAV3();
        v3.msg();
        v3.call();
        v3.status();
    }

}
class WAV1 // grand parent
{
    public void msg()
    {
        System.out.println("u can send msg");
    }
}
class WAV2 extends WAV1 //parent
{
    public  void call()
    {
        System.out.println("u can call");
    }
}
class WAV3 extends WAV2 // child
{
    public void status()
    {
        System.out.println("u can update status");
    }
}