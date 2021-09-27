package ltd.clearsolutios;

import java.util.Collections;
import java.util.List;

import static java.util.Objects.isNull;

public class NamesCalculatorCounter extends NamesCalculator{

    private List<String> names;
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public NamesCalculator setNames(List<String> names) {
        this.names = names;
        return this;
    }

    @Override
    public Integer calculate(String name)
    {
        if (isNull(name)
                || name.isBlank()
                || name.isEmpty()) {
            return 0;
        }

        count = Collections.frequency(names, name);

        return count;
    }
}
