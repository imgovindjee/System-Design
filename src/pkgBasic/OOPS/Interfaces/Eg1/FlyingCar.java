package pkgBasic.OOPS.Interfaces.Eg1;

public class FlyingCar implements Flyable, Drivable{
    @Override
    public void drive() {
        System.out.println("FlyingCar is driving---");
    }

    @Override
    public void fly() {
        System.out.println("FlyingCar is flying---");
    }
}
