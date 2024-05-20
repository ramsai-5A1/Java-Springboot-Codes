package IntroTopics;

public class GoldBox extends Box2 {

    public GoldBox(String name) {
        super(name);
    }

    public void printNameInReverse() {
        System.out.println("Within child class");
    }

}

// whenever we are extending a abstract class, then within the child class, we need to 
// write body for all the abstract methods that were present within parent class.