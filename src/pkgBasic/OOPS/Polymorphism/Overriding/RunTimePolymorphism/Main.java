package pkgBasic.OOPS.Polymorphism.Overriding.RunTimePolymorphism;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
    }
}
