import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        System.out.println("Welcome to Check Num is Prime or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = input.nextInt();
        boolean result= checkIsPrime(num);
        if(result){
            System.out.println("Your Number is Prime ");
        }else{
            System.out.println("Your number is not prime");
        }
    }
    public static boolean checkIsPrime(int num){
        int i=2;
        while(i<num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
