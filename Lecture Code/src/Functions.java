import java.util.Scanner;

public class Functions {
    public static void main(String[] args){
        System.out.println("In Main Method");
       // greetings();
       // pattern1();
        //taking two number for add
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println(sumOfTwoNumber(first,second)); //these are arguments
    }

    //methods, DRY=don't repeat yourself
    public static void greetings(){
        System.out.println("Hey! From Greeting Method");
    }

    //Method for printing the start patters
    public static void pattern1(){
        int row = 0;
        while(row < 5){
            System.out.print("*");
            int i=0;
            while(i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }

    //Method for Sum Two Number,Parameter and Aruguments Understanding
    public static int sumOfTwoNumber(int a, int b){ //Parameters
        int sum = a + b;
        return sum;
    }
}
