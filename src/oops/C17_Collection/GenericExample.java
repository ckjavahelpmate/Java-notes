package oops.C17_Collection;

import oops.c6_isArelationship.A;

import java.util.ArrayList;

class Cab{}
class Auto extends  Cab{}
class Mini extends  Cab{}
class Luxury extends  Cab{}

class Vehicle{}
class Pulsar extends  Vehicle{}
class Apache extends  Vehicle{}

public class GenericExample
{
    public static void main(String[] args)
    {
        ArrayList<Cab>  v1 = new ArrayList<>() ; // [ Cab v1]
        v1.add( new Cab() ) ;
        v1.add( new Auto() ) ;
        v1.add( new Mini() ) ;

        ArrayList<Vehicle> v2 = new ArrayList<>();
        v2.add( new Vehicle() ) ;
        v2.add( new Pulsar() ) ;
        v2.add( new Apache() ) ;

    }
}


