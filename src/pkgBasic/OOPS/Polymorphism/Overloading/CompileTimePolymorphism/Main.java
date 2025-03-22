package pkgBasic.OOPS.Polymorphism.Overloading.CompileTimePolymorphism;

public class Main {
    public static void main(String[] args) {
        Opers opers = new Opers();
        System.out.println(opers.add(1, 2));
        System.out.println(opers.add(12, 12, 10));
    }
}
