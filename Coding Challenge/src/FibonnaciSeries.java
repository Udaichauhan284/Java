import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonnaci Series");
        System.out.print("Enter the Number ");
        int num = input.nextInt();
        printTheSeries(num);
    }
    public static void printTheSeries(int num){
        int first = 0;
        int second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        if(num < 0) return;
        if(num == 0) System.out.print(first + " ");
        if(num == 1) System.out.print(first + " " + second);
        while(first + second < num){
            int third = first+second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
