package pkgBasic.OOPS.Polymorphism.Overriding.RunTimePolymorphism;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }
}
