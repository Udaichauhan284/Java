import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name:  ");
        String name = scanner.nextLine();
        System.out.println("Welcome !" + name);
    }
}
