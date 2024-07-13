import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        System.out.println("Welcome To Odd/Even Program by Bitwise");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1 ");
        int num1 = input.nextInt();

        if((num1 & 1) == 1){
            System.out.println("Number is ODD");
        }else{
            System.out.println("Number is EVEN");
        }
    }
}
