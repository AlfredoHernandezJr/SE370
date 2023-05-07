import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWrite {

	public static void main(String[] args) 
	
		throws IOException
	{
		// Text to be written
		String text = "Welcome to CSUSM, this is round 0 of writing to a database";

		// Filepath location and creation if needed
		Path fileName = Path.of("resources/file1.txt");

		// Write to the file
		Files.writeString(fileName, text);

		// Prints out the text written to the file
		String file_content = Files.readString(fileName);
		System.out.println(file_content);
	}
}
