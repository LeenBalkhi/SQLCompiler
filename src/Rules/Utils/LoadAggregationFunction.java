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

    public LoadAggregationFunction(String methodName) {

    }

    public static Object call(ArrayList<Double> nums) {
     String JARPath = "D:\\Flutter Projects\\Agg\\out\\artifacts\\Agg_jar\\Agg.jar";
     String ClassName = "CommonAggregations";
     String MethodName = null;
        try {
            URLClassLoader myClassLoader = new URLClassLoader(
                    new URL[]{new File(JARPath).toURI().toURL()},
                    LoadAggregationFunction.class.getClassLoader()
            );
            Class<?> myClass = Class.forName(ClassName, true, myClassLoader);
            Method mySingeltonGetterMethod = myClass.getMethod("get" + ClassName,
                    null);
            Object myObject = mySingeltonGetterMethod.invoke(null);
            var myValue = myObject.getClass().getMethod(MethodName, List.class)
                    .invoke(myObject, nums);
            return myValue;
        }catch (Exception e){
            return null;
        }
    }
}
