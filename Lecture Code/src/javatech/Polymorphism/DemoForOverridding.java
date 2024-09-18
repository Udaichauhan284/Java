package javatech.Polymorphism;
class calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}
class advCalc extends calc{
public int add(int n1, int n2){
    //in this we just extra 1 to it
    return n1+n2+1;
}
}
public class DemoForOverridding {
    public static void main(String[] args){
        //right now in advCalc have no method so when we call add it will refer to calc add
        advCalc obj = new advCalc();
        //but when advCalc have its own add method, then its override its functionality
        int ans = obj.add(3,5);
        System.out.println(ans);
    }
}
