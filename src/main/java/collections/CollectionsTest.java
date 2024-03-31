package collections;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("kiwi");
        list.add("apple");
        list.add("orange");
        list.add("banana");


      //  System.out.println(list.get(0));
        String search = "banana";

        for (String element : list){
            if (element.equals(search)) {
                System.out.println(element);
            }
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("Введите фрукт из списка для удаления: ");
        String query = new Scanner(System.in).nextLine();
        String fruit1 = null;
        for (String element : list) {
            if (query.equals(element)){
                fruit1 = element;
            }
        }
        list.remove(fruit1);
        System.out.println(list);

        System.out.println("Введите букву для поиска фруктов с такой буквой: ");
        String letter = new Scanner(System.in).next();
        List<String> result2 = new ArrayList<>();
        for (String fruit : list) {
            if (fruit.contains(letter)){
                result2.add(fruit);
            }
        }
        list = result2;
        System.out.println(list);

        System.out.println("Введите фрукт для добавления в список: ");
        String newFruit = new Scanner(System.in).next();
        list.add(newFruit);
        System.out.println(list);

        Set<String> uniqueFruits = new HashSet<>(list);
        // uniqueFruits.addAll(list);
        System.out.println(uniqueFruits);
        list = new ArrayList<>(uniqueFruits);
        System.out.println("Добавление новых элементов...");
        list.add("pear");
        list.add("cherry");
        list.add("lemon");
        list.add("apricot");
        System.out.println(list);
        Set<String> sortedList = new TreeSet<>(list);
        list = new ArrayList<>(sortedList);
        System.out.println(list);

        Queue<String> queue = new PriorityQueue<>(list);
        queue.remove();
        System.out.println(queue);

        Map<String,Integer> fruitCounts = new HashMap<>();
        for (String fruit : queue) {
            fruitCounts.put(fruit, new Random().nextInt(10));
        }
        System.out.println(fruitCounts);

        System.out.println("Фрукты количеством больше пяти: ");
        List<String> fruitsCountMoreThanFive = new ArrayList<>();
        for (Map.Entry<String, Integer> fruitBasket : fruitCounts.entrySet()) {
            if (fruitBasket.getValue() >5 ){
                fruitsCountMoreThanFive.add(fruitBasket.getKey());
            }
        }
        System.out.println("Результат:");
        System.out.println(fruitsCountMoreThanFive);

    }
}
