package challenges.abstraction;

public class Bird implements Flyable{
    private String breed;

    public Bird(String breed){
        this.breed = breed;
    }

    //getter and setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void fly() {

    }
}
