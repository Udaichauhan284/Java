import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        System.out.println("Welcome to Sum of Digits");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int num = input.nextInt();
        int result = sumOfDig(num);
        System.out.println("Sum of Digits " + result);
    }

    public static int sumOfDig(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
