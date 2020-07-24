package Rules.AST.SQL;

import java.util.ArrayList;

public class Data extends SqlStatment {
    String Database;
    ArrayList<Table> Tables = new ArrayList<>(); //migh change later to entities of tables
}
