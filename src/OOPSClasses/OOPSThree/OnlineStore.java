package OOPSClasses.OOPSThree;

public class OnlineStore {

    public static void main(String[] args) {
        Product electronics = new Electronics("I-Phone", 65000.0);
        Product clothing = new Clothing("Kurtha-pyjama", 12000.0);

        System.out.println("Discount of: " + electronics.getName() + " is: " + electronics.calculateDiscount());
        System.out.println("Discount of: " + clothing.getName() + " is: " + clothing.calculateDiscount());

        System.out.println(clothing.calculateShippingCost());
        System.out.println(electronics.calculateShippingCost());

        
    }

}
