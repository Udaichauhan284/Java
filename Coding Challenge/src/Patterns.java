import java.util.Scanner;

public class Patterns {
//    public static void main(String[] args){
//        for(int i=0; i<5; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println("");
//        }
//    }

    //Pattern 2.
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        rightHalfPattern(num);
    }
    public static void rightHalfPattern(int num){
        int rows = num;
        while(rows > 0){
            //reverse loop, till rows is bigger then 0
            //first print spaces
            int j = 0;
            while(j < rows-1){
                System.out.print(" ");
                j++;
            }

            //print starts
            int i = 0;
            while(i <= (num-rows)){
                System.out.print("*");;
                i++;
            }
            System.out.println(" ");
            rows--;
        }
    }
}
