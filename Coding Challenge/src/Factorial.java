import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Welcome to factorial program");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Num ");
        int num = input.nextInt();
        int result = fact(num);
        System.out.println("The Fact of Num " + result);
    }
    public static int fact(int num){
        int ans = 1;
        if(num == 0 || num == 1){
            return ans;
        }
        int i = 2;
        while(i <= num){
            ans = ans * i;
            i++;
        }
        return ans;
    }
}
