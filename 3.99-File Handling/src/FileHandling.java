import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        //writing  
        File file = new File("C://Temp/test5.txt");
        if (file.createNewFile()) {
            System.out.println("file created successfully");
        } else {
            System.out.println("file already exist");
        }
        
        String data = "Hello Manish. ";
        String data2="how are you doing?";
        Files.write(Paths.get("C://Temp/test5.txt"), data.getBytes());
        System.out.println("File Written Successfully");
        //appending
        FileWriter writer= new FileWriter(file);
        writer.append(data);
        writer.append(data2);
        writer.close();
        System.out.println("File Appended Successfully\n");
        //for reading
        FileReader f1 = new FileReader(file);
        BufferedReader reader = new BufferedReader(f1);
        String line ="";
        while ((line=reader.readLine()) != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
        System.out.println("File Readed Successfully");    
    }
}
