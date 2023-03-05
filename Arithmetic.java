//Clase en donde se encuentran las operacions matematicas
import java.util.LinkedList;

public class Arithmetic {
    public static Object operations(Object expression) throws LispException {
        if (expression instanceof Integer) {
            return expression;
        } else if (expression instanceof LinkedList) {
            LinkedList<Object> list = (LinkedList<Object>) expression;
            if (list.isEmpty()) {
                throw new LispException("Lista vacía");
            }
            String operator = list.getFirst().toString();
            if ("+".equals(operator)) {
                int result = 0;
                for (int i = 1; i < list.size(); i++) {
                    result += (int) operations(list.get(i));
                }
                return result;
            } else if ("-".equals(operator)) {
                if (list.size() < 2) {
                    throw new LispException("Operador '-' necesita al menos 2 argumentos");
                }
                int result = (int) operations(list.get(1));
                for (int i = 2; i < list.size(); i++) {
                    result -= (int) operations(list.get(i));
                }
                return result;
            } else if ("*".equals(operator)) {
                if (list.size() < 2) {
                    throw new LispException("Operador '*' necesita al menos 2 argumentos");
                }
                int result = 1;
                for (int i = 1; i < list.size(); i++) {
                    result *= (int) operations(list.get(i));
                }
                return result;
            } else if ("/".equals(operator)) {
                if (list.size() != 3) {
                    throw new LispException("Operador '/' necesita exactamente 2 argumentos");
                }
                int dividend = (int) operations(list.get(1));
                int divisor = (int) operations(list.get(2));
                if (divisor == 0) {
                    throw new LispException("División por cero");
                }
                return dividend / divisor;
            } else {
                throw new LispException("Operador desconocido: " + operator);
            }
        } else {
            throw new LispException("Tipo de expresión desconocido: " + expression.getClass().getSimpleName());
        }
    }

}
