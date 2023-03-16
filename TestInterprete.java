import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class TestInterprete {

    @org.junit.Test
    public void Arithmeticadd (){
        int esperado = 8;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("+");
        arrayList.add("4");
        arrayList.add("4");

        int resultado = Arithmetic.evaluate(arrayList);

        assertEquals(esperado,resultado);

    }
    @org.junit.Test
    public void Arithmeticmul (){
        int esperado = 16;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("*");
        arrayList.add("4");
        arrayList.add("4");

        int resultado = Arithmetic.evaluate(arrayList);

        assertEquals(esperado,resultado);

    }

    @org.junit.Test
    public void Predicateg (){
        boolean esperado = false;
        boolean resultado = Predicate.greaterThan(1,2);

        assertEquals(esperado,resultado);
    }

    @org.junit.Test
    public void Predicatel (){
        boolean esperado = true;
        boolean resultado = Predicate.lessThan(1,2);

        assertEquals(esperado,resultado);
    }

    @org.junit.Test
    public void Setq (){
        Setq<String, Integer> setq = new Setq<>();
        setq.setq("cero",0);
        int esperado = 0;

        int resultado = setq.get("cero");

        assertEquals(esperado, resultado);



    }



}
