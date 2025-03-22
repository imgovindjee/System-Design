package pkgBasic.OOPS.Inheritance.Types.Hierarchical;

public class Main {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.show(); // FROM OWN CLASS
        child1.display(); // FROM PARENT CLASS

        Child2 child2 = new Child2();
        child2.show(); // FROM OWN CLASS
        child2.display(); // FROM PARENT CLASS
    }
}
