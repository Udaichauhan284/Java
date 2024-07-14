import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        System.out.println("Welcome to GCD");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number 1 ");
        int first = input.nextInt();
        System.out.print("Enter the Number 2 ");
        int second = input.nextInt();
        int result = gcd(first,second);
        System.out.println("The GCD of Two Number " + result);
    }

    public static int gcd(int num1, int num2){
        int i = 1;
        int gcd = 1;
        int least = findLeast(num1,num2);
        while(i <= least){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int findLeast(int num1, int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}
