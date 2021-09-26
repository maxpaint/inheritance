package ltd.clearsolutios;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        List<String> names = new NameLoader().getNames("names.txt");
        String name = args[0];
        Integer count = new NamesCalculator()
                .setNames(names)
                .calculate(name);
        System.out.println("We have " + count + " " + name + " in our list");
    }
}
