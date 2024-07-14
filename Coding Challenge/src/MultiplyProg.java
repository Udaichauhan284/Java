import java.util.Scanner;

public class MultiplyProg {
    public static void main(String[] args){
        //multiply of given number
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Multiplication ");
        System.out.print("Enter the Number ");
        int a = input.nextInt();
        multipleNum(a);
    }
    public static void multipleNum(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
