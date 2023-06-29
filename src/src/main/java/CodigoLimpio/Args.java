package CodigoLimpio;

import java.util.HashMap;
import java.util.Map;

public class Args {
    private Map<String, String> arguments;

    public Args(String[] args) {
        arguments = new HashMap<>();

        for (int i = 0; i < args.length; i++) {
            String argument = args[i];

            if (argument.startsWith("-")) {
                if (i < args.length - 1 && !args[i + 1].startsWith("-")) {
                    String value = args[i + 1];
                    arguments.put(argument.substring(1), value);
                    i++;
                } else {
                    arguments.put(argument.substring(1), "");
                }
            }
        }
    }

    public String get(String argumentName) {
        return arguments.get(argumentName);
    }

    public boolean has(String argumentName) {
        return arguments.containsKey(argumentName);
    }
}