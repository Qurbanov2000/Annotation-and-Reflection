package AnnotationTask;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        AnnotationDetection annotationDetection = new AnnotationDetection();
        AnnotationDetection.detectAnnotation(myClass.getClass());

        Person person = new Person("Ali",24);

    }
}
