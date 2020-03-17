package Rules.SymbolTablepkg;

import Rules.AST.Java.Utils.Value;

public class Symbol {
    protected Scope scope; // the owning scope
    protected String name;
    protected SymbolType type;
    protected Values values;

    public Symbol(String name, SymbolType type, Values values) {
        this.name = name;
        this.type = type;
        this.values = values;
    }


    public Values getValues() {
        return values;
    }

    public void setValues(Values values) {
        this.values = values;
    }
//        return descriptor;
//    }

    public String getName() {
        return name;
    }

    public SymbolType getType() {
        return type;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }

    public int genId() {
        return scope.genId;
    }

    public String toString() {
        if (type != null) return '<' + getName() + ":" + type + '>';
        return getName();
    }
}
