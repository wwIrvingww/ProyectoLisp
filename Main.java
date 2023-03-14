/**
 * Se creo el main para hacer pruebas de las operaciones arimeticas
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /**
        try {
            Object result = Arithmetic.operations(list("+", 1, 2, 3));
            System.out.println(result); // Imprime -7
            result = Arithmetic.operations(list("-", 1, 5, 3));
            System.out.println(result); // Imprime 6
            result = Arithmetic.operations(list("*", 2, 3));
            System.out.println(result); // Imprime 6
            result = Arithmetic.operations(list("/", 0, 0));
            System.out.println(result); // Imprime 5
            result = Arithmetic.operations(list("+", 1, list("*", 2, 3)));
            System.out.println(result); // Imprime 7
        } catch (LispException e) {
            System.err.println(e.getMessage());
        }

    }*/
        /**
    public static List<Object> list(Object... elements) {
        LinkedList<Object> list = new LinkedList<>();
        for (Object element : elements) {
            list.add(element);
        }
        return list;
    }*/

        ReservedWords reservedWords = new ReservedWords();
        System.out.println(reservedWords.getReservedWords().get(0));


    }

}