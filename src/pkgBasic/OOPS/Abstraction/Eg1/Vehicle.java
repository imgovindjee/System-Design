package pkgBasic.OOPS.Abstraction.Eg1;

public abstract class Vehicle {
    private final String brand;

//    CONSTRUCTOR
    public Vehicle(String brand) {
        this.brand = brand;
    }

//    ABSTRACT METHOD
    public abstract void start();

//    CONCRETE CLASS
    public void displayBrand(){
        System.out.println("Brand is: "+brand);
    }
}
