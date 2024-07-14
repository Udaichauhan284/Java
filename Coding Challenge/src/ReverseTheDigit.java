import java.util.Scanner;

public class ReverseTheDigit {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse the number program");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int num = input.nextInt();
        int result = reverseNum(num);
        System.out.println("The result is " + result);
    }

    public static int reverseNum(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
