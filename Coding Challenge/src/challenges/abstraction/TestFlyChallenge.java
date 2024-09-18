package challenges.abstraction;

public class TestFlyChallenge {
    public static void main(String[] args){
        Eagle e1 = new Eagle();
        System.out.println(e1.getBreed());
        e1.fly();
    }
}
