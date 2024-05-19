package IntroTopics;
//import java.util.Scanner;
// import java.util.class2; 
import java.util.*;



// java.util ---> Scanner, class2, class3, class4 ......
// java.util --> is a library which java itself provides us

public class Box {


    public static void main(String[] args) {

        // class Student {
        //     int y;
        //     public Student(int y) {
        //         this.y = y;
        //     }
        // }

        // n number of times where 'n' is given by user 
        // only once within any function
        Scanner obj = new Scanner(System.in);
        //Student obj2 = new Student(10);
        System.out.println("Enter some integer: ");
        int n = obj.nextInt();
        System.out.println("You've entered value as: " + n);

        for (int i = 0; i < n; i++) {
            System.out.println("Hiii");
        }
        
        
    }
}
