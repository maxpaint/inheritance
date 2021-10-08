package ltd.clearsolutios;

import java.util.*;

import static java.util.Objects.isNull;

public class NamesCalculatorCounter extends NamesCalculator{

    private static Map<String, Integer> names;

    @Override
    public NamesCalculator setNames(List<String> names)
    {
        Map<String, Integer> mapNames = new HashMap<String, Integer>();
        for (String name : names)
        {
            Integer count = mapNames.get(name);
            mapNames.put(name, (count == null) ? 1 : count + 1);
        }

        this.names = mapNames;
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

        return names.get(name);
    }
}
