package pkgBasic.OOPS.Inheritance.Eg1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAnimal_name("IRISH");
        dog.bark(); // DEFINED IN DOG-CLASS
        dog.eat();  // INHERITED FROM PARENT-CLASS
    }
}
