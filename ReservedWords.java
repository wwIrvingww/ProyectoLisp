//Clase de las palabras claves de lisp
import java.util.ArrayList;
import java.util.Arrays;

public class ReservedWords {

	private ArrayList<String> ReservedWords = new ArrayList<String>();

	public ArrayList<String> getReservedWords() {
		return ReservedWords;
	}


	    
	
	public ReservedWords() {
		ReservedWords = new ArrayList<String>();
		ReservedWords.add("quote");
		ReservedWords.add("defun");
		ReservedWords.add("equals");
		ReservedWords.add("print");
		ReservedWords.add("setq");
		ReservedWords.add("atom");
		ReservedWords.add("list");
		ReservedWords.add("cond");
		ReservedWords.add("+");
		ReservedWords.add("-");
		ReservedWords.add("*");
		ReservedWords.add("/");
		ReservedWords.add("'");
		ReservedWords.add("(");
		ReservedWords.add(")");
		ReservedWords.add("<");
		ReservedWords.add(">");
	}

}
