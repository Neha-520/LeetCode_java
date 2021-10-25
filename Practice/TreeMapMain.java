import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1000, "Tom");
        t.put(2000, "Peter");
        t.put(3000, "Anne");
        t.put(9000, "Percy");
        t.put(11000, "Annabeth");
        System.out.println(t);

        t.forEach((k, v) -> System.out.println("Key: " + k + "\tValue: " + v));
        System.out.println(t.lastKey());
        System.out.println(t.firstKey());

        Set<Integer> keysLessThan3K = t.headMap(3000).keySet();
        System.out.println(keysLessThan3K);

        Set<Integer> keysMoreThan3k = t.tailMap(3000).keySet();
        System.out.println(keysMoreThan3k);

        //
        TreeMap<String, Integer> UserMap = new TreeMap<>();
        UserMap.put("Zara", 100);
        UserMap.put("Brad", 200);
        UserMap.put("Kane", 400);
        UserMap.put("Leo", 50);
        UserMap.put("Jason", 900);
        UserMap.put("Steve", 130);
        UserMap.put("Damon", 300);

        UserMap.forEach((k, v) -> System.out.println("Key: " + k + "\tValue: " + v));

        TreeMap<Integer, String> t2 = new TreeMap<>(Comparator.reverseOrder());
        t2.put(1000, "Tom");
        t2.put(2000, "Peter");
        t2.put(3000, "Anne");
        t2.put(9000, "Percy");
        t2.put(11000, "Annabeth");
        System.out.println(t2);
    }
}
