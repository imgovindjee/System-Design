package pkgBasic.OOPS.Composition.IsA.HasA.Relation.hasa;

public class Wheel {

    private String wheelType;

    public Wheel(String wheelType) {
        this.wheelType = wheelType;
    }

    public void rotate() {
        System.out.println("The "+wheelType+" wheel is rotating");
    }
}
