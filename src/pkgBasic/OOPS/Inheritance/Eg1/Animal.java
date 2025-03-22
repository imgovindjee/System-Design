package pkgBasic.OOPS.Inheritance.Eg1;

public class Animal {

//    String animal_name;
    private String animal_name;

//    GETTER N SETTER
    public String getAnimal_name() {
        return animal_name;
    }
    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }


    public void eat() {
        System.out.println(animal_name+" is eating--");
    }
}
