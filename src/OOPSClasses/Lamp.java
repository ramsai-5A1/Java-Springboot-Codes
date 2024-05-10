package OOPSClasses;

public class Lamp {
    private boolean flag = false;

    public void Lamp() {
        System.out.println("Lamp-Constructor is getting executed");
    }

    public void trunOn() {
        flag = true;
        System.out.println("Lamp turned on");
    }

    public void turnOff() {
        flag = false;
        System.out.println("Lamp turned off");
    }
}
