package Advanced.CollectionFramework.LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    @SuppressWarnings({"unchecked","rawtypes"})
    public static void main(String[] args){
    
     
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(100);
        linkedList1.add(200);
        linkedList1.add(300);
        linkedList1.add(300);

        System.out.println("Linked list 1: "+ linkedList1);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.add("Linkedlist colection");
        linkedList2.add(1);
        linkedList2.add(4.5);
        linkedList2.add('d');
        System.out.println("linked list 2: " + linkedList2);

        LinkedList linkedList3 = new LinkedList();
        linkedList3.addFirst("1st node");
        linkedList3.addLast("Last node");
        linkedList3.add(1, "2nd node");

        System.out.println("linked list 3: " + linkedList3);
        // data retrieval
        System.out.println("Linked List second indexed element: " + linkedList3.get(2));
        // retrieving index of element
        System.out.println("Linked List  index of ->(1st Node) element: " + linkedList3.indexOf("1st node"));
        // retrieving last index of a duplicate element
        System.out.println("Linked List index of 300: "+ linkedList1.lastIndexOf(300));
        // 
        // peek returns the first element of the linked list without removing it
        System.out.println("linked list 3 peek: " + linkedList3.peek());
        // peek returns the first element of the linked list after removing it
        System.out.println("linked list 3 poll: " + linkedList3.poll());
        System.out.println("linked list 3 pop: " + linkedList3.pop());
        
        System.out.println("linked list 3 after poll & pop: " + linkedList3);
        linkedList3.push("pushed data");
        System.out.println("Linked list 3 after push: "+ linkedList3);

        // applying polymorphism
        List polymorpisedLinkedList = new LinkedList();
           polymorpisedLinkedList.add(900);
        Deque polymorpisedLinkedList2 = new LinkedList();
           polymorpisedLinkedList2.add(90);
        System.out.println("polymorphisedLinkedList " + polymorpisedLinkedList + 
        " " + polymorpisedLinkedList2);
        

    }
}
