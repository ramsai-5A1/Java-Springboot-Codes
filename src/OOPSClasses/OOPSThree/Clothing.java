package OOPSClasses.OOPSThree;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.2;
    }

    @Override
    public double calculateTax() {
        return price * 0.1;
    }

    @Override
    public double calculateShippingCost() {
        return price * 0.3;
    }
}
