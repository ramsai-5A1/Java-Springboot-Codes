package OOPSClasses.OOPSThree;

public class Electronics extends Product {

    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.1;
    }

    @Override
    public double calculateTax() {
        return price * 0.15;
    }

    @Override
    public double calculateShippingCost() {
        return 10.0;
    }
}
