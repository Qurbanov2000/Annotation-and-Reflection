package AnnotationTask;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationDetection {
    public static void detectAnnotation(Class<?> clazz) {
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
                System.out.println("methodName: " + method.getName() + "annotation value: " + myAnnotation.value());
            } else {
                System.out.println("methodName: " + method.getName() + " hasn't MyAnnotation annotation" );
            }
        }
    }
}
