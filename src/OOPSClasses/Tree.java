package OOPSClasses;

abstract class Tree {
    public abstract void sum();
    protected abstract void divide();

    public void product() {
        System.out.println("Product method body");
    }

    protected void subtraction() {
        System.out.println("Subtraction method body");
    }
}
