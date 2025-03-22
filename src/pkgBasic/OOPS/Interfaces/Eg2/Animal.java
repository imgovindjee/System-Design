package pkgBasic.OOPS.Interfaces.Eg2;

public interface Animal {
    public default void sleep() {
        System.out.println("Sleeping---");
    }

    public void sound();
}
