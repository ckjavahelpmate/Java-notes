package oops.C16_Collection;

public class GarbageCollector
{
    public static void main(String[] args)
    {

        GarbageCollector obj = new GarbageCollector() ;                  //    obj = null
        System.out.println( obj );

        obj = null ;

        System.gc();


    }
}

/*
    Heap Area
====================
    GarbageCoolector@100abc ==> Referenced Object
    [                    ]

    Student@100abc ==> Unreferenced Object
    [           ]

====================
    Thread Name : Garbage Collector
    Work : Destroy Unreferenced Object From Heap Area
    GC will be called often by JVM
    programmer also can call GC Explicitly using "System.gc()"
 */