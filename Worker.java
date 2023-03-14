/**
 * Clase que se encarga de gestionar todas las operaciones y/o procesos, es decir este es el controlador
 */

import java.util.LinkedList;
public class Worker {

    LinkedList<String> instruccions;

    public Worker(LinkedList<String> instruccions) {
        this.instruccions = new LinkedList<>();
    }

    //------------------------------------------------------------------//
    public void work() {
        for (String string : instruccions) {
            //ReservedWords

            //if (ReservedWords.contains(string)){
            System.out.println("word reserve: " + string);


        }


    }


}

