package Rules.Utils;

public class RandomNameGenerator {
    public static int i=0;
    public static String generateNewRandomName(){
        String str = "RandName".concat(Integer.toString(i));
        i++;
        return str;
    }
}
