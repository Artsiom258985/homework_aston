import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OwnArrayList<String> list = new OwnArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("" + i);
        }
        list.forEach(System.out::print);
        System.out.println("\nsize = " + list.size());
        list.add("8");
        list.forEach(System.out::print);
        System.out.println("\nsize = " + list.size());

        List<String> newList = List.of("5", "6", "7");
        list.addAll(newList);
        list.forEach(System.out::print);
        System.out.println("\nsize = " + list.size());

        list.remove(2);
        list.forEach(System.out::print);
        System.out.println("\nsize = " + list.size());

        list.remove(0);
        list.forEach(System.out::print);
        System.out.println("\nsize = " + list.size());

        list.remove(list.size() - 1);
        list.forEach(System.out::print);
        System.out.println("\nsize = " + list.size());

        int[]array = {1,8,6,7,2,9,4};
        OwnArrayList.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}