package challenges.abstraction;

public class Eagle extends Bird{
    public Eagle(){
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("I am Eagle and I am FLying");
    }
}
