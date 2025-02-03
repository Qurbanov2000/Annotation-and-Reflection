package AnnotationTask;

public class PersonPrinter {
    public static void printPerson(Person person) {
        person.print();
    }
    public static void main(String[] args) {
        Person person = new Person("Ali",24);
        printPerson(person);
    }
}
