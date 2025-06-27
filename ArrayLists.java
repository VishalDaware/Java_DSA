import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        // System.out.println(list);

        // System.out.println(list.get(0));

        // add element in betn
        list.add(1, 2);
        // System.out.println(list);

        // set element
        list.set(0, 5);
        // System.out.println(list);

        // delete element
        list.remove(0);
        // System.out.println(list);

        // size of list
        // System.out.println(list.size());

        list.add(4);
        list.add(5);

        // for loop
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i));
        // }

        // sorting of arraylist by Collections framework
        Collections.sort(list);
        System.out.println(list);

    }

}
