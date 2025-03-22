package pkgBasic.OOPS.Composition.IsA.HasA.Relation.hasa;

public class Transmission {
    private String type;

    public Transmission(String type){
        this.type = type;
    }

    public void gearShift(){
        System.out.println("Transmission shifted: "+type);
    }
}
