class Vehicle {

    Vehicle() {
        System.out.println("Vehicle Constructor Called");
    }
}

class Car extends Vehicle {

    Car() {

        super();

        System.out.println("Car Constructor Called");
    }
}

public class SuperConstructor {

    public static void main(String[] args) {

        Car myCar = new Car();
    }
}