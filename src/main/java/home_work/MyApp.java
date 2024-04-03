package home_work;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple,milk,coffee");
        list.add("tea,chocolate,coffee");
        list.add("orange,rice,beer");
        List<String> result = list.stream()
                .filter(s -> s.contains("coffee"))
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println();


        List<Integer> number = List.of(2, 3, 6, 8);
        List<Integer> integers = number.stream()
                .map(a -> a * a)
                .collect(Collectors.toList());
        System.out.println(integers);

        System.out.println();

        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(8, 2, 6, 4, 7));
        List<Integer> result3 = setA.stream()
                .filter(setB::contains)
                .collect(Collectors.toList());
        System.out.println(result3);

        System.out.println();

        List<String> text = new ArrayList<>();
        text.add("apple");
        text.add("coffee");
        text.add("milk");
        text.add("orange");
        text.add("coffee");
        List<String> result4 = text.stream()
                .sorted()
                .distinct()
                        .collect(Collectors.toList());
        System.out.println(result4);

        System.out.println();

        List<String> name = new ArrayList<>();
        name.add("Sam");
        name.add("Piter");
        name.add("Dima");
        name.add("Brendon");


        Queue<String> queue = new PriorityQueue<>(name);
        queue.stream()
                        .sorted(Comparator.comparing(String::length))
                                .forEach(System.out::println);

        System.out.println();

       List<Integer> integers1 = new ArrayList<>();
       integers1.add(22);
       integers1.add(34);
       integers1.add(50);
       integers1.add(2);
       integers1.add(22);
        integers1.stream()
                .filter(integer -> Collections.frequency(integers1,integer) == 1)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
















    }
}
