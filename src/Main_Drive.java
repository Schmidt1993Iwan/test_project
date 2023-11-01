public class Main_Drive {
    public static void main(String[] args) {
        Car car = new Car("Audi", "A4", 200);
        Car car1 = new Car("BMW", "X7", 300);
        Car car2 = new Car("Skoda", "Rapid", 140);
        car.drive();
        car1.drive();
        car2.drive();

    }
}
