package pkgBasic.OOPS.Inheritance.Types.Multiple;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.print(); // FROM GRANDPARENT CLASS
        child.display(); // FROM PARENT CLASS
        child.show(); // FORM ITS OWN CLASS
    }
}
