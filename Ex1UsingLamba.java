import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex1UsingLamba
 */
public class Ex1UsingLamba {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 1, 4, 3));
        
        List<Integer> result = list.stream().sorted((a, b) -> a - b).collect(Collectors.toList());

        System.out.println(result);
    }    

}