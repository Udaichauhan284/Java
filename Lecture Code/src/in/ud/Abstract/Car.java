package in.ud.Abstract;

public class Car extends Vehicle{
    private int numOfDoors;
    public Car() {
        super(4);
    }
    public void commute(){
        System.out.println("Car Is Moving ..... ");
    }

    //here subclass is using the abstract method from Vehicle.
    @Override
    public void makeSound() {
        System.out.println("Making Sound ... ");
    }

    @Override
    public void travel() {
        System.out.println("Traveling from point A to B ");
    }
}
