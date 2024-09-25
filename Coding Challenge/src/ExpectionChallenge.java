import java.util.Scanner;

public class ExpectionChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int first = sc.nextInt();
        System.out.println("Enter the second number ");
        int second = sc.nextInt();
        try{
            int result = first / second;
            System.out.println("The result is " + result);
        }catch(ArithmeticException e){
            if(e.getMessage().equals("/ by zero")){
                System.out.println("You dividing by Zero");
            }else{
                throw e;
            }
        }
    }
}
