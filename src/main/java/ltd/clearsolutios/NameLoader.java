package ltd.clearsolutios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NameLoader {

    List<String> getNames(String fileName) throws IOException {
        Path path = Paths.get("src/main/resources/" + fileName);
        return  Files.readAllLines(path);
    }
}