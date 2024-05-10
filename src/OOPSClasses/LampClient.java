package OOPSClasses;

public class LampClient {
    public static void main(String[] args) {
        Lamp obj1 = new Lamp();
        obj1.trunOn();
        obj1.turnOff();

        Lamp halogen = new Lamp();
        halogen.trunOn();
        halogen.turnOff();
    }
}
