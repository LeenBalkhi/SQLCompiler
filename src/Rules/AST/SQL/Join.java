/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package Rules.AST.SQL;

import Rules.AST.Node;

import java.util.List;

public class Join extends SqlStatment {

    public boolean outer = false;
    public boolean left = false;
    public boolean inner = false;
//    private FromItem rightItem;
//    private Expression onExpression;

}
