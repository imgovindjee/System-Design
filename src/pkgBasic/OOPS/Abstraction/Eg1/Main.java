package pkgBasic.OOPS.Abstraction.Eg1;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Car("TATA");
        vehicle.displayBrand();
        vehicle.start();
    }
}
