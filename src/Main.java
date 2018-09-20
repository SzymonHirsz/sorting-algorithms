import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");
        final List<Integer> list = generateList(10000000);
        //System.out.println(list.toString());
        long time = System.currentTimeMillis();
        List<Integer> mergeSorted = MergeSort.sort(list);
        System.out.println(System.currentTimeMillis()-time);
        //System.out.println(mergeSorted.toString());
        time = System.currentTimeMillis();
        list.sort(Integer::compareTo);
        System.out.println(System.currentTimeMillis()-time);

    }

    private static List<Integer> generateList(int number) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i =0; i<number; i++){
            numbers.add(random.nextInt());
        }
        return numbers;
    }
}
