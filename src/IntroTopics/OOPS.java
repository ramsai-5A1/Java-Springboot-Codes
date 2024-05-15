package IntroTopics;



public class OOPS {

    static class Box {
        int length;
        int breadth;
    
        Box(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
    
        void printArea() {
            System.out.println("Area is: " + this.length * this.breadth);
        }
    }


    public static void main(String[] args) {
        System.out.println("Starting the program");

        Box obj = new Box(12, 3);
        obj.printArea();

        // object creation is happening in below line
        
        // Student obj = new Student("Krishna", "5A1");
        // obj.printNameAndRollNumber();

        // System.out.println(obj.printSum());
        // System.out.println(obj.printSum(12));
        // System.out.println(obj.printSum(10, 3));
        // System.out.println(obj.printSum(11, 2, 10));

        // Student obj2 = new Student("Krishna", "5A1", 45, 89);
        // obj2.printNameAndRollNumber();

        // Student obj2 = new Student(obj);
        // obj2.printNameAndRollNumber();

        System.out.println("Ending the program");
    }

}
