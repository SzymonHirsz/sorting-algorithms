import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");
        List e = generateList(10);
        System.out.println(e.toString());
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
