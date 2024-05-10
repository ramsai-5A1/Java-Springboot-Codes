package OOPSClasses;

public class BoxClient {
    
    public static void main(String[] args) {
        Box obj1 = new Box();
        System.out.println("Flag is:" + obj1.getFlag());

        Box obj2 = new Box(4);
        System.out.println("Flag is:" + obj2.getFlag());

        Box obj3 = new Box(1, 2);
        System.out.println("Flag is:" + obj3.getFlag());

        Box obj4 = new Box(1, 2, 3);
        System.out.println("Flag is: " + obj4.getFlag());

        Box obj5 = new Box(10, 2, "hello");
        System.out.println("Flag is: " + obj5.getFlag());

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);

        // System.out.println("Sum is: " + obj1.getSum());
        // System.out.println("Sum is: " + obj1.getSum(1));
        // System.out.println("Sum is: " + obj1.getSum(10, 1));
        // System.out.println("Sum is: " + obj1.getSum(10, 1, 2));
    }

}
