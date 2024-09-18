package javatech.Polymorphism;

class A {
    void show1(){
        System.out.println("in A show");
    }
}
//class A doesnt know B exists, but B knows A ts parent
class B extends A{
    void show2(){
        System.out.println("In B Show");
    }
}
public class DemoForTypeCasting {
    public static void main(String[] args){
        A obj = new A();
        obj.show1();

        //upcasting, A ref but taking B obj
        A obj1 = new B(); //or A obj1 = (A) new B();
        obj1.show1(); //show1 method of A will called, but still obj1 is a
        //reference of A so it donest not know show2 of B
        //obj1.show2(); this is not possible

        //Down Casting, we initialize with same reference of obj1, but cast with B
        B obj2 = (B) obj1; //obj1 have A reference and we down-casting it with B
        obj2.show1();
        obj2.show2();
    }
}
