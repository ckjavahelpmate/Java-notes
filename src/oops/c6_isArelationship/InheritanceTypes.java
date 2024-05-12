package oops.c6_isArelationship;

/* Inheritance types ==> 5 types
1) Single level ==> Single parent and single child
    class A
    {
    }
    class B extends A
    {
    }

2) Multi-level inheritance ==> More one level of inheritance
    class A
    {
    }
    class B extends A
    {
    }
    class C extends B
    {
    }
    class D extends C
    {
    }

3) Multiple Inheritance ==> Multiple parents with single child ==> Not possible in java Using Only class because of ambiguity problem
    note :: one class can extends to only one class
        class A                                                            class B
        {      public void eat()                                          {  public void eat()
               {                                                               {
                    s.o.pln("A class eat")                                          s.o.pln("B class eat")
               }                                                                }
        }                                                                  }
                            class C extends A , B
                            {
                                    public static void main(String[] args)
                                    {
                                        C obj = new C();
                                        obj.eat() ;
                                    }
                           }

4) Hierarchical Inheritance ==> Single Parent with Multiple child
                                 class A
                                {

                                }
         class B extends A                         class C extends A
         {                                          {
         }                                          }

5) Hybrid inheritance ==> combination of 2 or more types of inheritance

                                        class A {}

                                     class B extends A {}
            class X extends B {}                                   class Y extends B {}

 */
