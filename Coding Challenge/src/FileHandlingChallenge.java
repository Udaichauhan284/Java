import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the File Name ro read ");
        String fileName = sc.nextLine();
        try (FileReader reader = new FileReader(fileName)){
            int read = 0;
            while((read = reader.read()) != -1){
                System.out.print((char)read);
            }
        }catch(FileNotFoundException exp){
            System.out.println("File Not FOund Error Occur " + exp.getMessage());
        }catch(IOException e){
            System.out.println("Error occured " + e.getMessage());
        }
    }
}
