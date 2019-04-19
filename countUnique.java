import java.util.*;

public class countUnique {

    public static int countUnique(List<Integer> list) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(countUnique(new ArrayList<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15))));
    }
}