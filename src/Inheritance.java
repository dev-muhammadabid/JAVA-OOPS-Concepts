public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance");
    }
}


/*
Basic Inheritance

PARENT-Class
class Vehicle{
    int wheels;
    String model;

    void start(){
        System.out.println("Bhummm Bhumm Start---");
    }
}

CHILD-Class
class Car extends Vehicle{                  //"extends" inherit parent properties to child
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheels = 4;
        obj.model = "Sports";
        obj.start();
    }
}

*/