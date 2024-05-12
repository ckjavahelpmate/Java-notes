package oops.c10_polymorphism.methodoverriding;

public class Bird
{
    public void eat()
    {
        System.out.println("big seads/grains");
    }
}
class BabyBird extends Bird
{
    public void eat()
    {
        System.out.println("small seads/grains");
    }
}