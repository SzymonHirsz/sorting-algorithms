import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");
        final List<Integer> list = generateList(10000000);


        long time = System.currentTimeMillis();
        List<Integer> mergeSorted = MergeSort.sort(list);
        time = System.currentTimeMillis()-time;
        System.out.println("Czas merge sort: ");
        System.out.println(time);

        time = System.currentTimeMillis();
        List<Integer> quickSorted = QuickSort.sort(list);
        time = System.currentTimeMillis()-time;
        System.out.println("Czas quick sort: ");
        System.out.println(time);

        time = System.currentTimeMillis();
        list.sort(Integer::compareTo);
        time = System.currentTimeMillis()-time;
        System.out.println("Czas domyślny sort: ");
        System.out.println(time);

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
