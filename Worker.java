/**
 * Clase que se encarga de gestionar todas las operaciones y/o procesos, es decir este es el controlador
 */

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

        for (String string : instruccions) {
            if (reservedWords.getReservedWords().contains(string)) {
                switch (string){
                    case "+":

                }



            }
        }


    }


}

