package AnnotationTask;

public record Person(String name, int age) {
    public void print() {
        System.out.println("Person: " + name + " " + age);
    }
}
