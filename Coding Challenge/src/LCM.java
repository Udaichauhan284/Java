import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        System.out.println("Welcome to LCM");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int first = input.nextInt();
        System.out.print("Enter the second number ");
        int second = input.nextInt();
        int result = lcm(first, second);
        System.out.println("LCM of two number " + result);
    }

    public static int lcm(int first, int second){
        int i = 1;
        while(true){
            int factor = i * first;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
        //return 0; //unreachable code,
        //i comment this return in case of infinite loop.
    }
}
