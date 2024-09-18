package in.ud.Abstract;

public class TestAbstraction {
    public static void main(String[] args){
       // Vehicle v = new Vehicle(4); //make abstract class, so it can only use as inhertited
        Car c1 = new Car();
        c1.commute();
        c1.makeSound();
        c1.travel();
    }
}
