//IN this we need to code 3 method with same name and do Overloading
class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
}
public class MethodOverloadingChallenge {

    public static void main(String[] args){
        Calculator add1 = new Calculator();
        int ans1 = add1.add(5,6);
        System.out.println("Answer of first add " + ans1);
        int ans2 = add1.add(5,6,10);
        System.out.println("Answer of second add " + ans2);
        double ans3 = add1.add(4.55, 5.66);
        System.out.println("Anser of third add " + ans3);
    }
}
