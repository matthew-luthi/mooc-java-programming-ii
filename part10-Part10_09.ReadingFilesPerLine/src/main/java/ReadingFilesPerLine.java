
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static List<String> read(String file) {
        //List<String> lines = new ArrayList<>();
        
        try {
            //Files.lines(Paths.get(file)).forEach(row -> lines.add(row));
            return Files.lines(Paths.get(file)).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return new ArrayList<>();
        //return lines;
    }

}
