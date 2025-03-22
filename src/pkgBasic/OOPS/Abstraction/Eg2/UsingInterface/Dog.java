package pkgBasic.OOPS.Abstraction.Eg2.UsingInterface;

public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog Barking---");
    }
}
