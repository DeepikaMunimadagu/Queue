import java.util.*;

public class Queue {
    public static void main(String args[]) {
        // Create a Queue of Integers using a LinkedList
        Queue<Integer> q = new LinkedList<>();
        
        // Adding elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);

        // Removing elements from the queue and printing them
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
