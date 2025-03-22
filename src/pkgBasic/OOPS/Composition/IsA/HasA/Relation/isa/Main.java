package pkgBasic.OOPS.Composition.IsA.HasA.Relation.isa;

public class Main {
    public static void main(String[] args){
        Car petrolCar = new Car(new PetrolEngine());
        petrolCar.startCar();

        Car dieselCar = new Car(new DieselEngine());
        dieselCar.startCar();
    }
}
