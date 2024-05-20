package IntroTopics;

// parent class 
// super class
public class Vehicle {

    int wheelsCount;
    int price;
    String brandName;

    public Vehicle() {
        this.wheelsCount = 0;
        this.price = 0;
        this.brandName = "None";
    }

    public Vehicle(int wheelsCount, int price, String brandName) {
        this.wheelsCount = wheelsCount;
        this.price = price;
        this.brandName = brandName;
    }

    public void printAllDetails() {
        System.out.println("WheelsCount is: " + this.wheelsCount);
        System.out.println("Price: " + this.price);
        System.out.println("Brand Name is: " + this.brandName);
    }

    public void printOnlyPrice(int a) {
        System.out.println("Price: " + this.price);
    }
}

// we can only override those methods which are present within parent class
