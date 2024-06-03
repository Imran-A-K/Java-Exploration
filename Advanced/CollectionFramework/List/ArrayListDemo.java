package Advanced.CollectionFramework.List;
import java.util.*;
public class ArrayListDemo {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add("ArrayList collection");
        al2.add(1);
        al2.add('j');
        al2.add(1.1);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add("Adding another collection");
       al3.addAll(al2);
        System.out.println(al3);
        al3.add(2, "Adding a data at specific index");
        System.out.println(al3);
        
        System.out.println("Contains 1 : at al3: " + al3.contains(1));
        System.out.println("index of value:1 : at al3: " + al3.indexOf(1));
        System.out.println("size of al3: " + al3.size());
        al3.ensureCapacity(10); // reserves from memory
        al3.trimToSize();
        al3.clear();
        System.out.println("clear al3: " +  al3) ;

        // polymorphism

        List polymorpisedArrayList = new ArrayList();
        polymorpisedArrayList.add(100);
        System.out.println("polymorpisedArrayList " +polymorpisedArrayList);

        System.out.println("al1: " + al1);
         //for loop
        // for(int i=0; i<al1.size();i++){
        //     Object o = al1.get(i);
        //     System.out.println(o);
        // }
        // for each loop
        // System.out.println("For each loop");
        // for(Object o: al1){
        //     System.out.println(o);
        // }  
        
        Iterator iterator =  al1.iterator();
        while (iterator.hasNext()) {
            Integer i = (Integer)iterator.next(); // object downcasting
            System.out.println(i);
            // System.out.println(iterator.next());
        }
        // can be used for reverse iteration
        ListIterator listIterator = al1.listIterator(al1.size());
        while (listIterator.hasPrevious()) {
            Integer i = (Integer)listIterator.previous(); // object downcasting
            System.out.println(i);
        }

        
    }
}
