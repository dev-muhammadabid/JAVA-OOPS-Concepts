public class Abstraction {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(4);
    }
}
    abstract class Vehicle{

    abstract void accelerate();

    abstract void brakes(int wheels);
}

class Car extends Vehicle{

    @Override
    void accelerate(){
        System.out.println("Car is Accelerating");
    }


    void brakes(int wheels) {
        System.out.println("Car brakes are pushed");
    }
}

