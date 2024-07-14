import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args){
        System.out.println("Welcome to Sum of Odd Number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int a = input.nextInt();
        int ans = oddSum(a);
        System.out.println("The sum of all odd number " + ans);
    }
    public static int oddSum(int num){
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i;
            i+=2; //for odd number
        }
        return sum;
    }
}
