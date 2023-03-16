/**
 * Se creo el main para hacer pruebas de las operaciones arimeticas
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Reader reader  = new Reader();
        String path ="C:\\Users\\USUARIO\\OneDrive\\UVG\\Clases\\Tercer Semestre\\Estructura de datos\\Codes\\ProyectoLisp\\code.txt";
        ArrayList<String> arrraylist = Reader.readFile(path);
        LinkedListt<String> linkedListt =reader.raderLinked(path);

        Node<String> node;

        node = linkedListt.getHead();
        Worker worker = new Worker();
        worker.recorrerLinkedList(linkedListt);

       worker.recorrerLinkedList(linkedListt);


    }
    

}

