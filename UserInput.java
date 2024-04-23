import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class UserInput {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the text to write into the file:");
        String text = userInput.nextLine();

        Path path = Path.of("output.txt");
        Files.writeString(path, text);

        System.out.println("Content written to the file:");
        System.out.println(Files.readString(path));
    }
}
