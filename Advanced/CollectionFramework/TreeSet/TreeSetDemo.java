package Advanced.CollectionFramework.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(100);
        treeSet.add(120);
        treeSet.add(20);
        treeSet.add(230);
        treeSet.add(330);
        
        treeSet.add(330); // duplicates not allowed
        System.out.println("Tree Set: "+ treeSet);
        // finding higher value of a data
        System.out.println("Higher value of 100: " + treeSet.higher(100));
        System.out.println("Lower value of 100: " + treeSet.lower(100));
        // gives the upper or lower value if the object is not present in the tree set in this case it wont 100 is already present
        System.out.println("Ceiled value of 100: " + treeSet.ceiling(100));
        System.out.println("Floored value of 100: " + treeSet.floor(100));
       // now it will give the next and previous value as 40 is not in the set
        System.out.println("Ceiled value of 40: " + treeSet.ceiling(40));
        System.out.println("Floored value of 40: " + treeSet.floor(40));
    }
}
