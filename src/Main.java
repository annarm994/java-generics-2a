import java.util.*;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Popped from stack: " + stack.pop());

        List<Integer> intList = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
        Utility.sort(intList);
        System.out.println("Sorted Integer List: " + intList);

        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "orange", "banana"));
        Utility.sort(stringList);
        System.out.println("Sorted String List: " + stringList);

        List<Number> numbers = new ArrayList<>(Arrays.asList(1, 2, 3.5, 4.8));
        System.out.println("Sum of numbers: " + Utility.sumOfNumberList(numbers));

        Utility.printCollection(numbers);

        Cache<String> cache1 = new Cache<>();
        cache1.add("key1", "value1");

        Cache<String> cache2 = new Cache<>();
        cache2.add("key2", "value2");

        cache1.addAll(cache2);
        System.out.println("Cache 1 after adding Cache 2: " + cache1.get("key2"));
    }
}
