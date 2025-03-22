package pkgBasic.OOPS.Composition.IsA.HasA.Relation.isa;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar(){
        engine.start();
        System.out.println("Car is ready to go---");
    }
}
