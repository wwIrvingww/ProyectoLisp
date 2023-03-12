import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Reader{

        public static ArrayList<String> readFile(String fileName){
            ArrayList<String> lines = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line.getClass());
                lines.add(line);
            }

            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo '" + fileName + "'");
            ex.printStackTrace();
        }
        return lines;
    }

    public LinkedList<String> convertArrayList(ArrayList<String> listaStrings) {
        LinkedList<String> listCaracter = new LinkedList<>();

        for (String string : listaStrings) {
            String[] caracteres = string.split("");
            boolean space = false;
            StringBuilder sb = new StringBuilder();
            for (String caracter : caracteres) {
                if (caracter.length() > 0) {
                    sb.append(caracter);
                    space = false;
                } else {
                    if (!space) {
                        sb.append(' ');
                        space = true;
                    }
                }
            }
            listCaracter.add(sb.toString());
        }
        return listCaracter;
    }

}
