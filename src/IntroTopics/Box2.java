package IntroTopics;

abstract public class Box2 {

    public String name;

    public Box2(String name) {
        this.name = name;
    }

    // normal method
    public void printName() {
        System.out.println("Name is: " + this.name);
    }

    // abstract method
    abstract void printNameInReverse();
}

// abstract method: That method which is having abstract keyword at start of method signature,
// and there shouldn't be any body or implementation for that method.

// abstract class: We use abstract keyword before class definition, 
// There should be atleast one abstract method present within 
// the class.


// Doesn't matter how many normal methods were present within the class, if there is 
// at least one abstract method within the class, then we need to declare the class 
// as a abstract class.

// we can't create objects for abstract class. Then how can we use the member functions 
// which were present within that class.

// within abstract class, there can be both norma functions as well as abstract methods.
// but within interface, all methods are abstract. means we can't write the body of functions 
// within the interface, we need to implement the interface to write the body.