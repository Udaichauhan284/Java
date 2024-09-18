package challenges.abstraction;

public class TestChallenge {
    public static void main(String[] args){
        Circle c1 = new Circle(4.5);
        double circleArea = c1.calculateArea();
        System.out.println("Area of Circle " + circleArea);
        Square s1 = new Square(10);
        double squareArea = s1.calculateArea();
        System.out.println("Area of Square " + squareArea);
    }
}
