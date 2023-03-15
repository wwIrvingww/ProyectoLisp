/**
 * Se creo el main para hacer pruebas de las operaciones arimeticas
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /**ArrayList<String> input = new ArrayList<>();
        input.add("+");
        input.add("2");
        input.add("3");
        input.add("4");

        int result = Arithmetic.evaluate(input);
        System.out.println(result); // Imprime "9.0"*/
        Reader reader  = new Reader();
        String path ="C:\\Users\\USUARIO\\OneDrive\\UVG\\Clases\\Tercer Semestre\\Estructura de datos\\Codes\\ProyectoLisp\\code.txt";
        ArrayList<String> arrraylist = Reader.readFile(path);
        LinkedList<String> linkedList = reader.convertArrayList(arrraylist);
        System.out.println(linkedList.size());



        /**for (String a: parentesis){
            System.out.println(a);
        }*/







    }





}
