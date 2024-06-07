package oops.C17_Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class F1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i));
            }
        }
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        HashSet<Integer> hs = new HashSet<>(); // [ 2, 1, 4 ,3 ]
        hs.add(2);
        hs.add(1);
        hs.add(4);
        hs.add(3);
        System.out.println(hs);
        for (int num : hs) // num = 3
        {
            if (num % 2 == 0) {
                System.out.println(num); // 2 , 4
            }
        }


    }

}
