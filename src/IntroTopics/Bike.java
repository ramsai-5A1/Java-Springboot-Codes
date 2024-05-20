package IntroTopics;


// child class 
// sub class
public class Bike extends Vehicle {

    boolean isItBike;
    public Bike(int wheelsCount, int price, String brandName) {
        super(wheelsCount, price, brandName);
        this.isItBike = true;
    }

    // annotation --> we can easily find errors during compile time itself
    @Override
    public void printAllDetails() {
        System.out.println("Is this a Bike ? " + this.isItBike);
    }

    @Override
    public void printOnlyPrice(int h) {
        System.out.println("From Child class --> printOnlyPrice");
    }
    
}

// vehicle --> bike --> Pulsar
