import java.util.Scanner;

public class ArmstrongNum {
    //armstrong - 153 => 1^2+5^2+3^2 => 153
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number");
        System.out.print("Enter the number to check ");
        int num = input.nextInt();
        int isArmstrong = isArmstrongNum(num);
        if(isArmstrong == num){
            System.out.println("Yes your number is Armstrong");
        }else{
            System.out.println("NO, your number is not");
        }
    }
    public static int isArmstrongNum(int num){
        int countDigit = numOfDigits(num);
        int result = 0;
        while(num > 0){
            int lastDigit = num % 10;
            result += pow(lastDigit, countDigit);
            num /= 10;
        }
        return result;
    }
    public static int numOfDigits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

}
