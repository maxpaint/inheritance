package ltd.clearsolutios;

import java.util.List;

import static java.util.Objects.isNull;

public class NamesCalculator {

    private List<String> names;

    public NamesCalculator setNames(List<String> names) {
        this.names = names;
        return this;
    }

    public Integer calculate(String name) {
        if (isNull(name) || name.isBlank() || name.isEmpty())
        {
            return 0;
        }

        int count = 0;

        for (String s : names) {
            if (name.equalsIgnoreCase(s)) {
                count++;
            }
        }
        return count;
    }
}
