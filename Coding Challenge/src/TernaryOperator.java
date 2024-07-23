import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ternary Operator Program ");
        System.out.print("Enter the number 1 ");
        int num1 = input.nextInt();
        System.out.print("Enter the number 2 ");
        int num2 = input.nextInt();

        //need to call the instance method
        TernaryOperator ternary = new TernaryOperator();
        int output = ternary.findMin(num1, num2);
        System.out.println("The minimum number among these two is " + output);
    }

    public int findMin(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }
}
