package Advanced.CollectionFramework.Legacy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LegacyDemo {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(19);
        vector.add(20);
        vector.add(15);
        vector.add(15);
        System.out.println("Vector: "+vector);

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Object object = (Integer)enumeration.nextElement();
            // System.out.println(enumeration.nextElement());
            System.out.println(object);
        }
        System.out.println("----------------");
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            Object object = (Integer)iterator.next();
            // System.out.println(enumeration.nextElement());
            System.out.println(object);
        }
    }
}
