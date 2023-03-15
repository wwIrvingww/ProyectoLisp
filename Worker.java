/**
 * Clase que se encarga de gestionar todas las operaciones y/o procesos, es decir este es el controlador
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Worker {

    LinkedList<String> instruccions;
    String path ="C:\\Users\\USUARIO\\OneDrive\\UVG\\Clases\\Tercer Semestre\\Estructura de datos\\Codes\\ProyectoLisp\\code.txt";
    Reader reader = new Reader();
    ReservedWords reservedWords = new ReservedWords();

    public Worker(LinkedList<String> instruccions) {
        this.instruccions = new LinkedList<>();
    }

    //------------------------------------------------------------------//
    public void work() {
            getElementsInsideParentheses(instruccions);


    }

    public static ArrayList<String> getElementsInsideParentheses(LinkedList<String> linkedList) {
        ArrayList<String> elementsInParentheses = new ArrayList<>();
        boolean isInParentheses = false;

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.contains("(")) {
                isInParentheses = true;
                String[] parts = element.split("\\(");
                if (parts.length > 1) {
                    String insideParentheses = parts[1];
                    String[] insideParts = insideParentheses.substring(0, insideParentheses.length() - 1).split(",");
                    for (String insidePart : insideParts) {
                        elementsInParentheses.add(insidePart.trim());
                    }
                }
            } else if (element.contains(")")) {
                isInParentheses = false;
            } else if (isInParentheses) {
                String[] insideParts = element.split(",");
                for (String insidePart : insideParts) {
                    elementsInParentheses.add(insidePart.trim());
                }
            }
        }
        elementsInParentheses = splitAarraylist(elementsInParentheses);

        return elementsInParentheses;
    }

    public static ArrayList<String> splitAarraylist(ArrayList<String> lista) {
        String str = lista.get(0);
        char[] chars = str.toCharArray();
        ArrayList<String> resultado = new ArrayList<String>();

        for (char c : chars) {
            resultado.add(Character.toString(c));
        }

        return resultado;
    }








}

