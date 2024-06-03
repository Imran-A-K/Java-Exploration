package Advanced.CollectionFramework.FailFastAndFailSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;
public class FailFastAndFailSafeDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(300);
        arrayList.add(400);

        // fail fast
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
             // this will throw ConcurrentModificationException
            // arrayList.remove(100);
            // arrayList.add(10); // this will throw ConcurrentModificationException
        }

        // fail safe
        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();
        al1.add(190);
        al1.add(130);
        al1.add(110);

        System.out.println(al1  );

        Iterator iterator2 = al1.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
             // this will not throw ConcurrentModificationException
             al1.add(10); 
        }
    }
}
