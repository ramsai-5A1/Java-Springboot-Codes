package IntroTopics;

// within interface, only abstract methods were allowed. That's why 
// this enables complete abstraction, because we can't see any implementation in interface.
// we can just see the method signature, but can't see body.

// There is no need for use to define 'abstract' keyword explicitly.
// because all methods are by default declared as 'abstract'. 
public interface RBIRules {

    // all methods present within interface are abstract metahods, so 
    // they don't be having body here. We need to write the body of these functions 
    // in implemntation class.

    public void sendMoney(int amount);
    public void receiveMoney(int amount);
    public void printBalance();

}
// finally, using interfaces we can be able to achieve complete abstraction. 

// java collections framework