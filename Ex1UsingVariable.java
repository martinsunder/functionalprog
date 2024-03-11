import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex1UsingLamba
 */
public class Ex1UsingVariable {

    public static Comparator<Integer> comparator = (o1, o2) -> o1 - o2;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 1, 4, 3));
        
        List<Integer> result = list.stream().sorted(comparator).collect(Collectors.toList());

        System.out.println(result);
    }    

}