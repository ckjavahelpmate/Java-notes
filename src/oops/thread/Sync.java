package oops.thread;
class T2 extends Thread {
    Emplolyee e;

    T2(Emplolyee e) {
        this.e = e;
    }
    public void run() {
        Sync.read(e);
    }
}
class T1 extends Thread {
    Emplolyee e;

    T1(Emplolyee e) {
        this.e = e;
    }
    public void run() {
        Sync.write(e);
    }
}
public class Sync {
    public static void main(String[] args) {
        Emplolyee e2 = new Emplolyee();
        e2.setId(202);
        e2.setName("Rajinikanth");
        T2 t2 = new T2(e2);
        T1 t1 = new T1(e2);

        t2.start();
        t1.start();
    }
    public static synchronized void read(Emplolyee e) {

        for (int i = 0; i < e.getName().length(); i++) {
            System.out.print(e.getName().charAt(i));

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println();
    }

    public static synchronized void write(Emplolyee e) {
        e.setName("Sheela");
        System.out.println("Name changed to " + e.getName());
    }
}

class Emplolyee {
    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*

1.Static nad Non-static with memory area's
2.Constructor Overloading  ond Constructor chaining ( this() vs super() )
3.Method overloading(same name & diff agrs) depends on args passed  vs Method Overriding( same name & same args) depends on Object created
4.Abstraction (Abstract class vs interface )
5.Inheritance ( child inheriting parent state & behaviours )
6.Encapsulation (private vars & getter , setter functions)


 */