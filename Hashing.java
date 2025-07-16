import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // size
        System.out.println("size of set is " + set.size());
        System.out.println(set);

        // // search
        // if (set.contains(1)) {
        // System.out.println("set contain 1");
        // }

        // if (!set.contains(6)) {
        // System.out.println("does not contain");
        // }

        // // delete
        // set.remove(1);
        // if (!set.contains(1)) {
        // System.out.println("set does not contain 1");
        // }

        // iterator
        Iterator it = set.iterator();
        // hasnext function
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());

        // hasnext (true or false)
        while (it.hasNext()) {
            System.out.println(it.next());

        }

    }

}
