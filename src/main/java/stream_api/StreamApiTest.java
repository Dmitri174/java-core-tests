package stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamApiTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {{
            add(3);
            add(5);
            add(1);
            add(4);
            add(2);
        }};

        System.out.println(list);

        List<Integer> squares = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int square = list.get(i) * list.get(i);
            squares.add(square);
        }

        System.out.println(squares);

        System.out.println("-----");
        List<Integer> list2 = List.of(3, 5, 1, 4, 2);
        System.out.println(list2);

        List<Integer> squares2 = list2.stream()
                .map(number -> number * number)
                .toList();

        System.out.println(squares2);

        System.out.println("-----");

        List<Integer> list3 = List.of(5, 6, 2, 8, 9, 10);
        System.out.println(list3);

        var result1 = list3.stream()
                .filter(a -> a > 5)
                .toList();

        var result2 = new ArrayList<>(result1);
        Collections.reverse(result2);
        System.out.println(result2);

        System.out.println("-----");

        List<Integer> list4 = List.of(4, 7, 8, 2, 9);
        List<Integer> result3 = list4.stream()
                .peek(System.out::println)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println)
                .toList();
        System.out.println(result3);

        System.out.println("-----");

        Stream.of(2, 5, 4, 8, 9, 10, 7, 22, 2, 7)
                .distinct()
                .filter(a -> a > 5)
                .filter(b -> b < 10)
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----");

        new Random().ints(0, 10).limit(10)
                .boxed()
                .sorted((a, b) -> {
                    if (a > b) {
                        return 1;
                    } else if (a < b) {
                        return -1;
                    } else {
                        return 0;
                    }
                })
                .forEach(a -> System.out.println(a));

        System.out.println("-----");

        List<String> names = new ArrayList<>();
        names.add("Vasek");
        names.add("Vitek");
        names.add("Adam");
        names.add("Dima");
        names.add("Sam");

        names.stream()
                .filter(name -> name.contains("a") )
                .forEach(name -> System.out.println(name + " " + name.length()));



    }
}
