package pkgBasic.OOPS.Abstraction.Eg1;

public class Car extends Vehicle{
//    CONSTRUCTOR
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Car is Starting---");
    }
}
