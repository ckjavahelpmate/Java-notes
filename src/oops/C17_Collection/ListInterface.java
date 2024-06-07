package oops.C17_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>(); // Searching Good but Modification bad
        al.add(10);
        al.add(20);
        al.add(30);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);

        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        Stack<Integer> s = new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);

    }
}
