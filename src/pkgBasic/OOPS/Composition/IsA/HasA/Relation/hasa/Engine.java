package pkgBasic.OOPS.Composition.IsA.HasA.Relation.hasa;

public class Engine {

    private final int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public void startEngine(){
        System.out.println("Engine Started with "+horsepower+" HP.");
    }
}
