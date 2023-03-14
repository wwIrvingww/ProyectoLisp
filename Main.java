/**
 * Se creo el main para hacer pruebas de las operaciones arimeticas
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> expression1 = new ArrayList<>();
        expression1.add("+");
        expression1.add(4);
        expression1.add(4);

        ArrayList<Object> expression2 = new ArrayList<>();
        expression2.add("*");
        expression2.add(2);
        expression2.add(expression1);

        try {
            int result1 = (int) Arithmetic.operations(expression1);
            System.out.println(result1); // Output: 8

            int result2 = (int) Arithmetic.operations(expression2);
            System.out.println(result2); // Output: 16
        } catch (LispException e) {
            e.printStackTrace();
        }




        /**
        try {

            Object result = Arithmetic.operations(("+", 1, 2, 3));
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
    }
}
