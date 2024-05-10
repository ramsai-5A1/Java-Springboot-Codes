package OOPSClasses;

public class Box {

    private int flag;

    Box() {
        System.out.println("No-args constructor is getting executed");
        flag = 2;
    }

    Box(int curr) {
        System.out.println("Parametrized constructor is getting invoked");
        flag = curr;
    }

    Box(int a, int b) {
        flag = a + b;
        System.out.println("2 parameters constructor");
    }

    Box(int a, int b, int c) {
        flag = a + b + c;
        System.out.println("3 parameters constructor");
    }

    Box(int a, int b, String word) {
        flag = a + b;
        System.out.println("3 parameters " + word);
    }

    public int getSum() {
        return 0;
    }

    public int getSum(int a) {
        return a;
    }

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getSum(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public String toString() {
        return this.flag + " is flag value";
    }

    public int getFlag() {
        return flag;
    }
}
