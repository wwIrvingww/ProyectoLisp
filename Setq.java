import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class Setq<K, V> {

    private final Map<K, V> variables;

    public Setq() {
        variables = new HashMap<>();
    }

    public void setq(K variable, V value) {
        variables.put(variable, value);
    }

    public V get(K variable) {
        return variables.get(variable);
    }
}

//------------------------------------------------------------------------------//

