import java.util.Scanner;

public class MarksCalculatorTernary {
    public static void main(String[] args){
        System.out.println("Welcome to Mark Calculator ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks ");
        int marks = input.nextInt();
        String output = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your marks " + output);
    }
}
