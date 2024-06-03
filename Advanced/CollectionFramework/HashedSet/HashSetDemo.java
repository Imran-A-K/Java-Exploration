package Advanced.CollectionFramework.HashedSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(100);
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(20);
        hashSet.add(300);

        System.out.println("HashSet: "+ hashSet);

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(5);

        System.out.println("LinkedHashSet: "+ linkedHashSet);
    }
}
