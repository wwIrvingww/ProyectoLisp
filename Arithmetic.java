//Clase en donde se encuentran las operacions matematicas
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.ArrayList;

public class Arithmetic {
    public static int evaluate(ArrayList<String> input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("El arraylist esta vacio.");
        }

        String operator = input.get(0);
        ArrayList<Integer> operands = new ArrayList<>();

        for (int i = 1; i < input.size(); i++) {
            operands.add(Integer.parseInt(input.get(i)));
        }

        int result = 0;

        switch (operator) {
            case "+":
                for (int operand : operands) {
                    result += operand;
                }
                break;
            case "-":
                result = operands.get(0);
                for (int i = 1; i < operands.size(); i++) {
                    result -= operands.get(i);
                }
                break;
            case "*":
                result = operands.get(0);
                for (int i = 1; i < operands.size(); i++) {
                    result *= operands.get(i);
                }
                break;
            case "/":
                result = operands.get(0);
                for (int i = 1; i < operands.size(); i++) {
                    result /= operands.get(i);
                }
                break;
            default:
                throw new IllegalArgumentException("Operador desconocido: " + operator);
        }

        return result;
    }
}
