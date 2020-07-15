package Rules.Utils;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class LoadAggregationFunction {
    String JARPath = "D:\\Flutter Projects\\Agg\\out\\artifacts\\Agg_jar\\";
    String ClassName = "CommonAggregations";
    String MethodName;
    String JARName = "Agg.jar";
    public ArrayList<Long> myNumbers;


    public LoadAggregationFunction(ArrayList<Long> list,String methodName) {
        myNumbers = list;
        MethodName = methodName;
    }



    public Object call() throws ClassNotFoundException, MalformedURLException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        URLClassLoader myClassLoader = new URLClassLoader(
                new URL[]{new File(JARPath + JARName).toURI().toURL()},
                LoadAggregationFunction.class.getClassLoader()
        );

        Class<?> myClass = Class.forName(ClassName, true, myClassLoader);
        Method mySingeltonGetterMethod = myClass.getMethod("get" + ClassName,
                null);
        Object myObject = mySingeltonGetterMethod.invoke(null);
        var myValue = myObject.getClass().getMethod(MethodName, List.class)
                .invoke(myObject, myNumbers);
        return myValue;
    }
}
