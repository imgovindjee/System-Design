package pkgBasic.OOPS.Composition.IsA.HasA.Relation.hasa;

public class Car {

    private Engine engine;
    private Wheel wheel;
    private Transmission transmission;

    public Car(Engine engine, Wheel wheel, Transmission transmission) {
        this.engine = engine;
        this.wheel = wheel;
        this.transmission = transmission;
    }

    public void drive() {
        engine.startEngine();
        wheel.rotate();
        transmission.gearShift();
        System.out.println("Car is moving");
    }
}
