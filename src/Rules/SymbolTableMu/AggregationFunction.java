package Rules.SymbolTableMu;

import Rules.AST.Node;

import java.util.ArrayList;

public class AggregationFunction extends Node {
    protected String AggregationFunctionName;
    protected String JarPath;
    protected String JarName;
    protected String ClassName;
    protected String MethodName;
    protected String returnType;

    public String getJarName() {
        return JarName;
    }

    public void setJarName(String jarName) {
        JarName = jarName;
    }

    private ArrayList<Object> params = new ArrayList<Object>();


    public String getAggregationFunctionName() {
        return AggregationFunctionName;
    }

    public void setAggregationFunctionName(String aggregationFunctionName) {
        AggregationFunctionName = aggregationFunctionName;
    }

    public String getJarPath() {
        return JarPath;
    }

    public void setJarPath(String jarPath) {
        JarPath = jarPath;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getMethodName() {
        return MethodName;
    }

    public void setMethodName(String methodName) {
        MethodName = methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public ArrayList<Object> getParams() {
        return params;
    }

    public void setParams(ArrayList<Object> params) {
        this.params = params;
    }

}