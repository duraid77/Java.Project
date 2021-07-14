package day61_exceptions_collections.errors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String filePath= "day61_exceptions_collections/errors/data.txt";

        List<String> data =Files.readAllLines(Paths.get(filePath));
        for (String line: data){
            System.out.println(line);
        }
    }
}
