import java.util.Scanner;

public class FactRecursion {
    public static void main(String[] args){
        System.out.println("Welcome to Factorial Program with Recursion");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = input.nextInt();
        long fact = fact(num);
        System.out.println("Your Num Factorial is " + fact);
    }

    public static long fact(int num){
        if(num == 1){
            return 1; //base condition
        }

        return num * fact(num-1);
    }
}
