package Rules.Utils;

public class Error extends Exception{
    public int line;
    public int col;
    public String Description;

    public void printError(){
        System.out.println("Error In Line: " + line + " - Column: "+ col + " - "+ Description);
    }

    public Error(int line, int col, String description) {
        this.line = line;
        this.col = col;
        Description = description;
    }
}
