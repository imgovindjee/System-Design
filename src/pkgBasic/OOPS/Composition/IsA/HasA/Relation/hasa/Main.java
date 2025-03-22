package pkgBasic.OOPS.Composition.IsA.HasA.Relation.hasa;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine(120), new Wheel("Alloy"), new Transmission("Automatic"));
        car.drive();
    }
}
