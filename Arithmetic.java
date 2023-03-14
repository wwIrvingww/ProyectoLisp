//Clase en donde se encuentran las operacions matematicas
import java.util.ArrayList;

public class Arithmetic {
    public static Object operations(ArrayList<Object> expression) throws LispException {
        if (expression.get(0) instanceof Integer) {
            return expression.get(0);
        } else if (expression instanceof ArrayList) {
            ArrayList<Object> list = new ArrayList<>();
            list.addAll(expression);
            if (list.isEmpty()) {
                throw new LispException("Lista vacía");
            }
            String operator = list.get(0).toString();
            if ("+".equals(operator)) {
                int result = 0;
                for (int i = 1; i < list.size(); i++) {
                    result += (int) operations((ArrayList<Object>)list.get(i));
                }
                return result;
            } else if ("-".equals(operator)) {
                if (list.size() < 3) {
                    throw new LispException("Operador '-' necesita al menos 2 argumentos");
                }
                int result = (int) operations((ArrayList<Object>)list.get(1));
                for (int i = 2; i < list.size(); i++) {
                    result -= (int) operations((ArrayList<Object>)list.get(i));
                }
                return result;
            } else if ("*".equals(operator)) {
                if (list.size() < 3) {
                    throw new LispException("Operador '*' necesita al menos 2 argumentos");
                }
                int result = 1;
                for (int i = 1; i < list.size(); i++) {
                    result *= (int) operations((ArrayList<Object>)list.get(i));
                }
                return result;
            } else if ("/".equals(operator)) {
                if (list.size() != 3) {
                    throw new LispException("Operador '/' necesita exactamente 2 argumentos");
                }
                int dividend = (int) operations((ArrayList<Object>)list.get(1));
                int divisor = (int) operations((ArrayList<Object>)list.get(2));
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
