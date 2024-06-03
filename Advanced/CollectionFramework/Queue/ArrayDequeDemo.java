package Advanced.CollectionFramework.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
     ArrayDeque arrayDeque1 = new ArrayDeque();
     arrayDeque1.add(100);
     arrayDeque1.add(100);
     arrayDeque1.addFirst(120);
     arrayDeque1.addLast(140);
     arrayDeque1.offer(160);
     arrayDeque1.offerFirst("offer first");
     arrayDeque1.offerLast("Offer last");

     arrayDeque1.addLast("Arradeque collection");
     System.out.println("ArrayDeque1: "+arrayDeque1);
    }
}
