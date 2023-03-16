/**
 * Clase que se encarga de gestionar todas las operaciones y/o procesos, es decir este es el controlador
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Worker {

    LinkedList<String> instruccions;
    String path ="C:\\Users\\USUARIO\\OneDrive\\UVG\\Clases\\Tercer Semestre\\Estructura de datos\\Codes\\ProyectoLisp\\code.txt";
    Reader reader = new Reader();
    ReservedWords reservedWords = new ReservedWords();



    //------------------------------------------------------------------//
    public void work() {
        Reader reader = new Reader();
        ArrayList<String> arrayList = Reader.readFile(path);
        instruccions = reader.convertArrayList(arrayList);

        ArrayList<String> parentesis = Worker.getElementsInsideParentheses(instruccions);


            for (String string: instruccions){
                if (string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/")) {
                    int result = Arithmetic.evaluate(parentesis);
                    System.out.println(result);
                }
                else if (string.equals("q")){
                    ArrayList<String> arrayList1 = Reader.readFile(path);
                    LinkedList<String> linkedList = reader.convertArrayList(arrayList1);


                    ArrayList<String> text;
                    text = getElementsAfterQuote(linkedList);
                    for (String word: text){
                        System.out.println(word);
                    }

                }


            }


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

    public static ArrayList<String> getElementsAfterQuote(LinkedList<String> linkedList) {
        ArrayList<String> elements = new ArrayList<>();
        boolean foundQuote = false;
        for (String item : linkedList) {
            if (item.equals("quote")) {
                foundQuote = true;
            } else if (foundQuote && item.endsWith(")")) {
                // Agregar todo lo que sigue después de "quote" hasta el paréntesis de cierre
                String insideQuote = item.substring(0, item.length() - 1);
                elements.addAll(Arrays.asList(insideQuote.split("\\s+")));
                foundQuote = false;
            } else if (foundQuote) {
                // Agregar elementos dentro de "quote" a la lista
                elements.addAll(Arrays.asList(item.split("\\s+")));
            }
        }
        return elements;
    }



    public static ArrayList<String> splitAarraylist(ArrayList<String> lista) {
            String str = lista.get(0);
            char[] chars = str.toCharArray();
            ArrayList<String> resultado = new ArrayList<String>();

            for (char c : chars) {
                if (c != ' ') {
                    resultado.add(Character.toString(c));
                }
            }

            return resultado;
        }
    public ArrayList<String> darArraylist(String string){

        String[] array = string.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : array) {
            String trimmed = s.trim();  // Eliminar espacios en blanco
            if (!trimmed.isEmpty()) {   // Ignorar cadenas vacías
                arrayList.add(trimmed); // Agregar al ArrayList
            }
        }
        return arrayList;


    }
    public void recorrerLinkedList(LinkedListt<String> linkedListt){
        ReservedWords reservedWords1 = new ReservedWords();
        Node<String> current = linkedListt.getHead();
        ArrayList<String> arrayWords = darArraylist(current.getValue());
        String firsWord = arrayWords.get(0);
        ArrayList<String> instruction;

        while (current != null) {
            // Procesar el valor actual del nodo
            //System.out.println(current.getValue());
            instruction = stringToArraylist(current.getValue());
            System.out.println(firsWord);

            if (reservedWords1.getReservedWords().contains(firsWord)){
                //Para operaciones aritmeticas
                if (firsWord.equals("+") || firsWord.equals("-") || firsWord.equals("*") || firsWord.equals("/")){
                    int result = Arithmetic.evaluate(instruction);
                    System.out.println("el resultado es: " + result);
                }

                //Para la instruccion quote
                else if (firsWord.equals("quote") || firsWord.equals("'")){
                    ArrayList<String> expression = new ArrayList<>();

                    for (String s:arrayWords){
                        if (s != "quote" || s!= "'" ){
                            expression.add(s);
                        }
                    }
                    Quote quote = new Quote(expression);

                }

                //Para la instrucción setq
                if (firsWord.equals("setq")) {
                    Setq<String, String> setq = new Setq<>();

                    String name = "";
                    String value = "";
                    String s;
                    int i = 0;
                    while (i<instruction.size()){
                        s = instruction.get(i);
                        if (s.equals("\"")){
                            name = instruction.get(i+1);
                            i++;
                        }
                        else if(s.equals(",")){
                            value = instruction.get(i+1);
                            i++;
                        }
                        else {i++;}

                    }

                    setq.setq(name,value);
                    System.out.println(setq.get(name));










                }



            }







            // Pasar al siguiente nodo
            current = current.getNext();
        }

    }
    public ArrayList<String> stringToArraylist(String string){
        String[] array = string.split(",");
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            String s = Character.toString(c);
            if (!s.trim().isEmpty()) {
                arrayList.add(s);
            }
        }
        return arrayList;
    }

}

