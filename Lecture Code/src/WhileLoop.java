import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] arg){
//        int num = 1;
//        while(num <= 10){
//            System.out.println(num);
//            num++;
//        }
        //Reverse Number Print
//        int num = 10;
//        while(num >= 1){
//            System.out.println(num);
//            num--;
//        }

        //number take 5 times
        int i=0;
        while(i < 5){
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            System.out.println("Your Number is " + num);
            i++;
        }
    }
}
