
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		 createFileMethod1();
		 createFileUsingNIO();

		 readFileContent();

	}

	private static void readFileContent() throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C://temp/test.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
	}

	private static void createFileUsingNIO() throws IOException {
		// Java.nio package stores datas using buffer for fast i/o.
		String data = "Hello world";
		Files.write(Paths.get("C://temp/test2.txt"), data.getBytes());

		List<String> lines = new ArrayList<String>();
		lines.add("first line: hello");
		lines.add("world");
		lines.add("this is india");

		Files.write(Paths.get("C://temp/test2.txt"), lines, StandardOpenOption.CREATE,    //Create a new file if it does not exist  
				StandardOpenOption.APPEND);		//if exists , appends to it
	}

	private static void createFileMethod1() throws IOException {
		File file = new File("c://temp/test.txt");

		if (file.createNewFile()) {
			System.out.println("File created successfully");
		} else {
			System.out.println("File is already exist");
		}

		String data = "hello world!";
		String data2 ="i am manish";


		FileWriter writer = new FileWriter(file);		
		writer.write(data);//writing on file
		//this need not to convert data into bytes it writes string directly
		writer.append(data2);//appending data to file
		writer.close();
	}
}