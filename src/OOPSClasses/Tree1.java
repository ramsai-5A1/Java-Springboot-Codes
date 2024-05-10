package OOPSClasses;

public class Tree1 extends Tree {

    public void sum() {
        System.out.println("Sum method in sub class");
    }

    protected void divide() {
        System.out.println("Abstract method is being implemented in sub class");
    }

    @Override
    public void product() {
        System.out.println("product method is getting overrided");
    }

    public static void main(String[] args) {
        Tree1 obj = new Tree1();
        obj.product();
        obj.divide();
        obj.sum();
        obj.subtraction();
    }

}
