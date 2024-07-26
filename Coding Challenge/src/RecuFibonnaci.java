import java.util.Scanner;

public class RecuFibonnaci {
    public static void main(String[] args){
        System.out.println("Welcome to Recursion Fibonnaci");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num = input.nextInt();
        for(int i=0; i<=num; i++){
            System.out.print(fibo(i) + " ");
        }
    }
    public static int fibo(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;

        return fibo(num-1) + fibo(num-2);
    }
}
