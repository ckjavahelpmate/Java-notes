package oops.c10_polymorphism.methodoverriding;

public class Chrome extends BaseClass {
    public void login() {
        System.out.println("Chrome");
    }
}

class Edge extends BaseClass {
    public void login() {

        System.out.println("Edge");
    }
}

class Firefox extends BaseClass {
    public void login() {
        System.out.println("Firefox");
    }
}

class Mozila extends BaseClass {
    public void login() {
        System.out.println("Mozila");
    }
}

