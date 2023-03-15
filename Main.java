/**
 * Se creo el main para hacer pruebas de las operaciones arimeticas
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> input = new ArrayList<>();
        input.add("+");
        input.add("2");
        input.add("3");
        input.add("4");

        int result = Arithmetic.evaluate(input);
        System.out.println(result); // Imprime "9.0"

    }
        /**
    public static List<Object> list(Object... elements) {
        LinkedList<Object> list = new LinkedList<>();
        for (Object element : elements) {
            list.add(element);
        }
        return list;
    }*/

}
