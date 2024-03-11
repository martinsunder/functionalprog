import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Ex1BeforeLambda
 */
public class Ex1BeforeLambda {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 3, 4, 5, 2));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        list.sort(comparator);

        System.out.println(Arrays.toString(list.toArray()));
    }
}
