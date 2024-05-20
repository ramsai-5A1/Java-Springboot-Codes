package IntroTopics;

public class Main {
    public static void main(String[] args) {
        // Bike obj = new Bike(2, 135000, "Pulsar");
        // obj.printAllDetails();

        //Box2 obj2 = new Box2("Raj");
        // GoldBox obj = new GoldBox("Raj");
        // obj.printNameInReverse();
        // obj.printName();

        StateBankOfIndia obj = new StateBankOfIndia();
        
        obj.receiveMoney(1000);
        obj.printBalance();
        obj.receiveMoney(200);
        obj.printBalance();
        obj.sendMoney(500);
        obj.printBalance();
    }
}


// whenever if we try to invoke any member function, then first of all, compiler 
// checks whether it is found within child class or not, if not then only 
// it checks in parent class.

// Poly + morphism --> Poly means "many", types
// method over-loading (Compile time polymorphism) --> its same function name, same return type, but different parameters (diff function signature)
// metho over-riding (Run-time polymorphism) --> its same function name, same return type, same parameters
// abstraction: Showing necessary features and hiding internal features is know as "Abstraction"
// eg: if we buy a car --> if we know driving its enough, there is no need for us to know how the engine is working behind the scens.

