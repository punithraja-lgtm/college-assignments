//didn't got any errors

abstract class formula{
    abstract double speed();
    abstract double velocity();
}

class Car extends formula{
    private double distance;
    private double time;
    private double displacement;

    public Car(double distance, double time, double displacement){
        this.distance = distance;
        this.time = time;
        this.displacement = displacement;
    }
    double speed(){
        return distance / time;
    }
    double velocity(){
        return displacement / time;
    }
}
class Bike extends formula{
    private double distance;
    private double time;
    private double displacement;

    public Bike(double distance, double time, double displacement){
        this.distance = distance;
        this.time = time;
        this.displacement = displacement;
    }
    double speed(){
        return distance / time;
    }
    double velocity(){
        return displacement / time;
    }
}
public class Mesure{
    public static void main(String[] args) {
        Car car = new Car(150, 3, 120);
        Bike bike = new Bike(90, 2, 80);

        System.out.println("Car Speed: " + car.speed() + " kmph");
        System.out.println("Car Velocity: " + car.velocity() + " kmph");
        System.out.println("Bike Speed: " + bike.speed() + " kmph");
        System.out.println("Bike Velocity: " + bike.velocity() + " kmph");
    }

}
