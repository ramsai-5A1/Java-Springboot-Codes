package IntroTopics;


// child class 
// sub class
public class Bike extends Vehicle {

    boolean isItBike;
    public Bike(int wheelsCount, int price, String brandName) {
        super(wheelsCount, price, brandName);
        this.isItBike = true;
    }
    
}

// vehicle --> bike --> Pulsar
