package IntroTopics;

class Student {

    // OOPS:
    // encapsulation, inheritence, abstraction 

    // data members (state)
    String name;
    String rollNumber;
    int os, dbms, cn;

    // In java, if we don't include at least one constructor in the class
    // then java itself includes default empty constructor



    // special member functions whose name is equal to class-name 

    // constructor name should be class name itself


    // default constructor
    Student() {
        System.out.println("Default construcor executed");
    }

    // paramaterized constructor
    Student(String name, String rollNumber) {
        System.out.println("Parametrized Constructor execution started");
        this.name = name;
        this.rollNumber = rollNumber;
        this.os = 0;
        this.dbms = 0;
        this.cn = 0;
        System.out.println("Parametrized Constructor execution ended");
    }

    // constructor over-loading (same function name, but different parameters)
    Student(String name, String rollNumber, int os, int dbms) {
        System.out.println("Parametrized Constructor type-2 execution started");
        this.name = name;
        this.rollNumber = rollNumber;
        this.os = os;
        this.dbms = dbms;
        this.cn = 0;
        System.out.println("Parametrized Constructor type-2 execution started");
    }

    // copy constructor 
    Student(Student other) {
        System.out.println("Copy constructor execution started");
        this.name = other.name;
        this.rollNumber = other.rollNumber;
        this.os = other.os;
        this.dbms = other.dbms;
        this.cn = other.cn;
        System.out.println("Copy constructor execution ended");
    }

    // member functions (behaviour)

    void printNameAndRollNumber() {
        // self --> this 
        // concatenating (combining or joining 2 or more strings)
        System.out.println("Name is: " + this.name + " Roll number is: " + this.rollNumber);
    }

    // method over-loading 
    // same function name, same return type but different number of parameters --> method overloading
    int printSum() {
        return 0;
    }

    // access specifiers 
    // public, protected, private

    int printSum(int a) {
        return a;
    }

    int printSum(int a, int b) {
        return a + b;
    }

    int printSum(int a, int b, int c) {
        return a + b + c;
    }

}



// classes definition, objects creation
// data members and member functions 
// constructors, different types of constructors
// constructor over-loading 
// method overloading 

// Create 2 to 4 different class in different files 
// in main function try to create objects for those classes
// try invoking the member functions present within those classes 
