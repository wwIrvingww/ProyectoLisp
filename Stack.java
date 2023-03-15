import java.util.Vector;

public class Stack <T>{

	 private Vector<T> vector;

	    public Stack (){
	        vector = new Vector<T>();
	    }
	 
	    public void push(T value) {
	        vector.add(value);
	    }

	    public T pull() {
	        T value;
	        if (isEmpty()) 
	            value = null;
	        else{ 
	            value = peek();
	            vector.remove(vector.get(count()-1));
	        }
	        return value;
	    }

	    public T peek() {
	        return vector.lastElement();
	    }
	
	    public int count() {
	        return vector.size();
	    }

	    public boolean isEmpty() {
	        return vector.isEmpty();
	    }
}
