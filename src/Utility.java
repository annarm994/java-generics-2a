import java.util.*;

public class Utility {

    public static <T extends Comparable<T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    public static void printCollection(Collection<?> collection) {
        for (Object item : collection) {
            System.out.println(item);
        }
    }

    public static double sumOfNumberList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
