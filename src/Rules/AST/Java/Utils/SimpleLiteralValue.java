package Rules.AST.Java.Utils;

import Rules.AST.Node;

import java.text.NumberFormat;
import java.text.ParseException;


public class SimpleLiteralValue extends Node {
    public String value;

    public Number getValue(){
        try {
            return NumberFormat.getInstance().parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getType(){
        try {
            return NumberFormat.getInstance().parse(value).getClass().getSimpleName();
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
