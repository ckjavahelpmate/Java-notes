package oops.c9_classcasting;
import java.util.Scanner;
public class OlaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Option");
        System.out.println("Press 1 for Auto");
        System.out.println("Press 2 for Min");
        System.out.println("Press 3 for Luxury");
        int choice = sc.nextInt();
        Cab cab = null;
        switch (choice) {
            case 1: cab = new Auto() ;break;
            case 2: cab = new Mini() ;break;
            case 3: cab = new Luxury();break;
            default: System.out.println("invalid selection...");
        }
        System.out.println("cab " + cab);
        System.out.println("you Booked " + cab.getClass().getSimpleName());
        if (cab instanceof Auto) {
            Auto auto = (Auto) cab;
            System.out.println("Price " + auto.price);
        } else if (cab instanceof Mini) {
            Mini mini = (Mini) cab;
            System.out.println("Price " + mini.price);
        } else if (cab instanceof Luxury) {
            Luxury luxury = (Luxury) cab;
            System.out.println("Price :: " + luxury.price);
        }


    }

}
