package in.ud.Abstract;

public abstract class Vehicle implements Transport {
    private int numOfWheels;

    //abstract method, only can defined
    public abstract void makeSound();
    public Vehicle(int numOfWheels){
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
}
