package Rules.Utils;

public class Warning extends Error{
    public Warning(int line, int col, String description) {
        super(line, col, description);
    }

    @Override
    public void printError(){
        System.out.println("Warning In Line: " + line + " - Column: "+ col + " - "+ Description);
    }
}
