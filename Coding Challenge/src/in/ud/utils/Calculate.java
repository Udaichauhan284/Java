package in.ud.utils;

import in.ud.geometry.Circle;
import in.ud.geometry.Rectangle;

public class Calculate {
    public static void main(String[] args){
        Circle circle = new Circle(10);
        Rectangle rec = new Rectangle(25, 30);

        long recArea = rec.length * rec.width;
        double circleArea = Math.PI * circle.radius * circle.radius;

        System.out.printf("Area of Rectangle %d, and Area of Circle %f ", recArea, circleArea);
    }
}
