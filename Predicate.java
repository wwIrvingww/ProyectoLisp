import java.util.ArrayList;

public class Predicate {

    //ATOM
    public static boolean atom(Object obj) {
        if (obj instanceof String || obj instanceof Number) {
            return true;
        } else {
            return false;
        }
    }

    //LIST
    public static boolean list(Object obj) {
        if (obj instanceof ArrayList) {
            return true;
        } else {
            return false;
        }
    }

    //<
    public static boolean lessThan(Number num1, Number num2) {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() < num2.doubleValue();
        } else {
            return num1.intValue() < num2.intValue();
        }
    }


    //>
    public static boolean greaterThan(Number num1, Number num2) {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() > num2.doubleValue();
        } else {
            return num1.intValue() > num2.intValue();
        }
    }







}
