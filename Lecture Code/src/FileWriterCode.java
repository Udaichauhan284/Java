import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCode {
    public static void main(String[] args){
        String fileName = "example.txt";
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("Hello this i have write using File Writer in Java");
            writer.flush();
            System.out.println("Successfully Written");
        }catch (IOException e){
            System.out.println("Error Occur " + e.getMessage());
        }
    }
}
