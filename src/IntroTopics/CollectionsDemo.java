package IntroTopics;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionsDemo {


    // part-1
    private static void arrayListDemo() {
        // Not synchronized, maintains insertion order
        ArrayList<Integer> list1 = new ArrayList<>();
        // Insertion
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);
        System.out.println(list1.size());

        // Deletion
        int curr = list1.remove(1);
        System.out.println(list1.indexOf(10));
        System.out.println(list1 + " " + curr);
        for (int index = 41; index <= 45; index++) {
            list1.add(index);
        }
        System.out.println(list1);

        list1.add(40);
        for (int ele: list1) {
            System.out.print(ele + ", ");
        }
        System.out.println();
        
        for (int index = 0; index < list1.size(); index++) {
            System.out.print(list1.get(index) + " --> ");
        }
        System.out.println();

        // Updation
        list1.set(3, -123);
        System.out.println(list1);
    }

    private static void linkedListDemo() {
        // Maintains Insertion order and Not synchronized
        LinkedList<Integer> list = new LinkedList<>();
        for (int val = 32; val <= 38; val++) {
            // Insert
            list.add(val);
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        for (int index = 0; index < list.size(); index++) {
            System.out.print(list.get(index) + " --> ");
        }
        System.out.println();

        // Delete
        System.out.println(list.remove(2));
        System.out.println(list);

        // Checking whether element is present in LL or not 
        System.out.println(list.contains(33));
        System.out.println(list.contains(34));

        // Update
        list.set(1, 1001);
        System.out.println(list);
    }

    private static void vectorDemo() {
        // Maintains Insertion order and also Synchronized
        Vector<Integer> vector = new Vector<>();
        for (int value = 23; value <= 28; value++) {
            // Insertion
            vector.add(value);
        }
        System.out.println(vector);

        System.out.println(vector.contains(24));
        System.out.println(vector.indexOf(24));

        // Deletion
        System.out.println(vector.remove(vector.indexOf(24)));
        System.out.println(vector.contains(24));

        // Updation
        vector.set(1, 230);
        System.out.println(vector);
        System.out.println(vector.size());
    }
    



     // part-2
     private static void setDemo() {
        Set<Integer> set = new HashSet<>();

        // Insertion
        for (int index = 98; index >= 91; index--) {
            set.add(index);
        }
        set.add(1);
        set.add(2);
        set.add(31);
        set.add(4);
        set.add(5);

        // Deletion
        set.remove(5);
        set.remove(5);
        set.remove(4);
        for (int index = 98; index >= 91; index--) {
            set.remove(index);
        }
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }

    private static void linkedHashSetDemo() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int value = 100; value >= 90; value--) {
            set.add(value);
        }
        set.add(null);
        set.add(null);
        set.remove(100);
        System.out.println(set + " " + set.size());
    }

    private static void TreeSetDemo() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int index = 100; index >= 92; index--) {
            set.add(index);
        }
        set.remove(92);
        System.out.println(set);
    }



    // part-3
    private static void stackDemo() {
        Stack<Integer> stack = new Stack<>();
        for (int val = 12; val <= 18; val++) {
            // Insert
            stack.push(val);
        }
        // Size
        System.out.println(stack.size());
        while (!stack.isEmpty()) {

            // Access top element
            System.out.println(stack.peek());

            // Delete
            int curr = stack.pop();
            System.out.println(curr);
        }
    }

    private static void queueDemo() {
        Queue<Integer> Q = new ArrayDeque<>();
        for (int val = 10; val <= 15; val++) {
            Q.add(val);
        }
        Q.add(123);
        System.out.println(Q.size());
        System.out.println(Q);
        while (!Q.isEmpty()) {
            int ele = Q.peek();
            System.out.println(Q.poll());
            System.out.println(ele);
        }
    }

    private static void arrayDequeueDemo() {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int val = 10; val <= 13; val++) {
            // Inserting from last
            deque.addLast(val);
        }
        System.out.println(deque);

        for (int val = 21; val <= 23; val++) {
            // Inserting from first
            deque.addFirst(val);
        }
        System.out.println(deque);

        // Deleting from first
        System.out.println(deque.removeFirst());
        System.out.println(deque);

        // Deleting from last
        System.out.println(deque.removeLast());
        System.out.println(deque);

        // Finding Size
        System.out.println(deque.size());
        while (!deque.isEmpty()) {
            System.out.println(deque.removeFirst());
        }
    }




    //part-4
    private static void minPriorityQueueDemo() {
        // For integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val = 12; val <= 18; val++) {
            // Inserting
            pq.add(val);
        }
        for (int val = 25; val >= 20; val--) {
            pq.add(val);
        }
        System.out.println(pq);
        while (!pq.isEmpty()) {
            // Accessing the top
            System.out.println(pq.peek());
            // Deleting
            System.out.println(pq.poll());
        }

        // For strings 
        PriorityQueue<String> spq = new PriorityQueue<>();
        spq.add("zebra");
        spq.add("apple");
        spq.add("forest");
        spq.add("egg");

        while (!spq.isEmpty()) {
            System.out.println(spq.peek());
            System.out.println(spq.poll());
        }
    }

    private static void maxPriorityQueueDemo() {
        // For integers
        Comparator<Integer> comparator1 = (a, b) -> Integer.compare(b, a);
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator1);
        for (int val = 10; val <= 15; val++) {
            // Insert
            pq.add(val);
        }
        System.out.println(pq);
        System.out.println(pq.size());
        while (!pq.isEmpty()) {
            // Access the top
            System.out.println(pq.peek());

            // Delete
            System.out.println(pq.poll());
        }

        // For strings
        Comparator<String> comparator = (a, b) -> b.compareTo(a);
        PriorityQueue<String> spq = new PriorityQueue<>(comparator);
        spq.add("zebra");
        spq.add("apple");
        spq.add("forest");
        spq.add("egg");

        while (!spq.isEmpty()) {
            System.out.println(spq.peek());
            System.out.println(spq.poll());
        }
    }
    



    //part-5
    private static void hashMapDemo() {
        // Maintains random order
        // Declaration
        HashMap<String, Integer> store = new HashMap<>();

        // Inserting key-value pairs
        store.put("krishna", 23);
        store.put("Ram", 54);
        store.put("Bijin", 12);
        System.out.println(store);

        // Size
        System.out.println(store.size());

        // Checking whether key is present or not
        System.out.println(store.containsKey("Ram"));

        // Extracting value for a given key
        System.out.println(store.get("Ram"));
        System.out.println(store.get("venky"));

        // Updating the key-value pair
        store.put("Ram", 56);
        System.out.println(store);
        System.out.println(store.get("Ram"));

        // Deleting a key-value pair
        store.remove("Ram");
        System.out.println(store);
        System.out.println(store.containsKey("Ram"));

        for (String key: store.keySet()) {
            System.out.println(key + " --> " + store.get(key));
        }

    }

    private static void linkedHashMapDemo() {
        // Maintains same order of insertion
        LinkedHashMap<String, Integer> store = new LinkedHashMap<>();
        store.put("parrot", 12);
        store.put("ant", 21);
        store.put("zebra", 223);
        store.put("Egg", 21);
        System.out.println(store.keySet());
        System.out.println(store.values());
        for (String key: store.keySet()) {
            System.out.println(key + " -----> " + store.get(key));
        }
        // for (Map.Entry obj: store.entrySet()) {
        //     System.out.println(obj.getKey() + " --> " + obj.getValue());
        // }
    }

    private static void treeMapDemo() {
        // Maintains keys in sorted manner
        TreeMap<String, Integer> store = new TreeMap<>();
        store.put("Zebra", 34);
        store.put("Ashoka", 122);
        store.put("Egg", 33);
        store.put("fcd", 233);
        store.put("cef", 22);
        store.put("abc", 23);

        for (String key: store.keySet()) {
            System.out.println(key + " ---> " + store.get(key));
        }
    }

   
        


    public static void main(String[] args) {
        System.out.println("Hello Collections");
        //arrayListDemo();
        //setDemo();
        //linkedHashSetDemo();
        linkedHashMapDemo();
    }

}
