package www.technoextreme.co.zw.javapractice;

public class SelfDrivingCar extends Car{

    public SelfDrivingCar(String chosenColour, String chosenInterior) {
        super(chosenColour, chosenInterior);
        System.out.println("Constructing self-driving car. Installing Skynet version 0.92.8");
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Driving you Home, Eco Park Estate Centurion");
    }
}
