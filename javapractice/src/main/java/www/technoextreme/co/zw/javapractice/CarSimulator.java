package www.technoextreme.co.zw.javapractice;

public class CarSimulator {

    public static void main(String[] args) {
        System.out.println("Starting Car Simulator...");

        Car myToyota = new Car("Blue", "Maroon");

//        System.out.println("My car is " + myToyota.colour);
//        System.out.println("My car has " +myToyota.getNumberOfSeats() + " seats");
//        myToyota.drive();

        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow", "Plastic");
        autoBot.drive();
        System.out.println("autoBot colour is: " +autoBot.colour);
        System.out.println("autoBot interior is: " +autoBot.mInterior);

    }
}
