package challenges.abstraction;

public class Square extends Shape{
    private int side;

    public Square(int side){
        this.side = side;
    }
    public int getSide(int side){
        return side;
    }
    public void setSide(int side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
