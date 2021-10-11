package ltd.clearsolutios;

import java.util.*;

import static java.util.Objects.isNull;

public class NamesCalculatorCounter extends NamesCalculator{

    private static Map<String, Integer> names;

    @Override
    public NamesCalculator setNames(List<String> names)
    {
        Map<String, Integer> mapNames = new HashMap<>();

        for (String name : names)
        {
            Integer count = mapNames.get(name);

            if(count == null)
                mapNames.put(name, 1);
            else
                mapNames.put(name, count+1);
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

        if(names.containsKey(name))
            return names.get(name);
        else
            return 0;
    }
}
