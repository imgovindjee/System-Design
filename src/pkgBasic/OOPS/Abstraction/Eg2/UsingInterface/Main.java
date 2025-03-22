package pkgBasic.OOPS.Abstraction.Eg2.UsingInterface;

public class Main {
    public static void main(String[] args){
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}
