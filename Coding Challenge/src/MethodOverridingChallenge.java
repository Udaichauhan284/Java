class Vehicle{
    public void service(){
        System.out.println("Vehicle is getting service ");
    }
}
class Car extends Vehicle{
    public void service(){
        super.service(); //this will call service of vehcile from car
        System.out.println("The veicle is CAR ");
    }
}
public class MethodOverridingChallenge {
    public static void main(String[] args){
        Vehicle veh = new Vehicle(); //this will vehicle ref
        veh.service();
        Car c1 = new Car();
        c1.service(); //this will also give vhicle getting service as we call super in that method
    }
}
