import java.util.ArrayList;
import java.util.List;

public abstract class QuickSort {
    public static List<Integer> sort (List<Integer> inputList){
        if(inputList.size() <= 1) return inputList;

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        Integer valueToCompare = inputList.get(0);
        inputList.remove(0);
        for(Integer i : inputList){
            if(i<=valueToCompare) leftList.add(i);
            else rightList.add(i);
        }
        leftList = sort(leftList);
        rightList = sort(rightList);
        leftList.add(valueToCompare);
        leftList .addAll(rightList);

        return leftList;
    }
}
