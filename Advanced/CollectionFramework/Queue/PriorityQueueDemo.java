package Advanced.CollectionFramework.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
   @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        PriorityQueue priorityQueue1 = new PriorityQueue();
        priorityQueue1.add(100);
        priorityQueue1.add(100);
        priorityQueue1.add(140);
        priorityQueue1.add(150);
        priorityQueue1.add(40);
        priorityQueue1.add(50);
        priorityQueue1.add(5);
        priorityQueue1.add(5);
        priorityQueue1.add(0);
        // not allowed
        // priorityQueue1.add("pp");

        System.out.println("PriorityQueue1: "+ priorityQueue1);

    }
}
