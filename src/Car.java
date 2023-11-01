public class Car {
    String brand;
    String model;
    int horsePower;


    public Car(String brand, String model, int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;

    }

    public void drive(){
        System.out.println("Машина "  + brand + " " + model + " едет "  + horsePower + " Лошадинных сил");
    }


}
