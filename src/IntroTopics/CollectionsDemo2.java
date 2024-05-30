package IntroTopics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionsDemo2 {

    public static void arrayListDemo() {
        ArrayList<Integer> list = new ArrayList<>();

        // Insertion
        for (int val = 32; val <= 38; val++) {
            list.add(val);
        }

        System.out.println(list);
        for (int ele: list) {
            System.out.print(ele + " --> ");
        }
        System.out.println();
        // Updation
        list.set(1, 10001);

        // Deletion
        list.remove(4);
        for (int index = 0; index < list.size(); index++) {
            // accessing
            System.out.print(list.get(index) + " ---> ");
        }
        System.out.println();
    }

    public static void setDemo() {
        // set maintains unique elements in any random order
        Set<Integer> set = new HashSet<>();
        for (int index = 45; index <= 50; index++) {
            // Insertion
            set.add(index);
        }
        System.out.println(set);
        // Checking whether element is present or not
        if (set.contains(45)) {
            // Deletion
            set.remove(45);
        } 
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(50));
    }

    public static void linkedListHashSetDemo() {
        // This DS maintains the same order of insertion and it stores as unique elements itself.
        Set<Integer> set = new LinkedHashSet<>();
        for (int index = 28; index >= 22; index--) {
            // Insertion
            set.add(index);
        }
        set.add(12);
        set.add(11);
        set.add(12);
        System.out.println(set);

        // check whether element is pesent or not
        System.out.println(set.contains(12));

        // Deletion
        System.out.println(set.remove(12));
        System.out.println(set.remove(12));
        System.out.println(set.contains(12));
    }

    public static void treeSetDemo() {
        // This DS maintains the unique elements in sorted manner
        Set<Integer> set = new TreeSet<>();
        for (int index = 40; index >= 33; index--) {
            // Insertion
            set.add(index);
        }
        System.out.println(set);

        // Checking whether element is present or not in set
        System.out.println(set.contains(40));
        System.out.println(set.contains(44));

        // Deletion
        System.out.println(set.remove(40));
        System.out.println(set.remove(40));
        System.out.println(set.contains(40));
        System.out.println(set.size());
        System.out.println(!set.isEmpty());
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        treeSetDemo();
    }

}
