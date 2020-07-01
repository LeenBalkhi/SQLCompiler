package Rules.SymbolTableMu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;

public class SymbolTable {
    public Stack<Scope> scopeStack;
    public LinkedHashMap<String, SqlType> sqlTypes;
    public ArrayList<TableOrSubQueryTypeEntry> queryManager = new ArrayList<>();
    public ArrayList<AggregationFunction> aggregationFunctions = new ArrayList<>();

    public SymbolTable() {
        scopeStack = new Stack<>();
        sqlTypes = new LinkedHashMap<>();
        pushScope();
    }

    public void pushScope(Scope scope) {
        Scope parent = (scopeStack.size() == 0 ? null : scopeStack.peek());
        scope.parent = parent;
        scopeStack.push(scope);
    }

    public void pushScope() {
        Scope parent = (scopeStack.size() == 0 ? null : scopeStack.peek());
        Scope newScope = new Scope(parent);
        scopeStack.push(newScope);
    }

    public void popScope() {
        scopeStack.pop();
    }


    public boolean isInScope(Scope scope, String variable) {
        HashMap<String, Symbol> currentMap = scope.symbolMap;
        if (currentMap.containsKey(variable))
            return true;
        return false;
    }

    public Symbol getSymbol(String variable) {
        for (int i = 0; i < scopeStack.size(); i++) {
            Scope currentScope = scopeStack.get(i);
            if (isInScope(currentScope, variable))
                return currentScope.symbolMap.get(variable);
        }
        return null;
    }



}