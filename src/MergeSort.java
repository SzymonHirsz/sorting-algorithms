import java.util.ArrayList;
import java.util.List;

public abstract class MergeSort {

    public static List<Integer> sort (List<Integer> list){
        if(list.size() == 1) return list;

        List<Integer> leftList = sort(list.subList(0, list.size() / 2));
        List<Integer> rightList = sort(list.subList(list.size()/2, list.size()));

        List<Integer> result= new ArrayList<>();
        int i=0; int j=0;
        while (i != leftList.size() && j != rightList.size()){
            Integer left = leftList.get(i);
            if(left < rightList.get(j)){
                result.add(leftList.get(i));
                i++;
            }
            else {
                result.add(rightList.get(j));
                j++;
            }
        }
        while (i != leftList.size()){
            result.add(leftList.get(i));
            i++;
        }
        while (j != rightList.size()){
            result.add(rightList.get(j));
            j++;
        }
        return result;
    }
}
