package arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] array = {7, 88, -3, 4, 45, 1, 8, 88, 3, -2, 7, 10};
        //вывести кол-во отрицательных элементов массива
  /*      int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        System.out.println(count);
        // Найти произведение всех четных чисел в массиве
        int mul = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                mul = mul * array[i];
            }
        }
        System.out.println("mul " + mul);
        // Найти количество дубликатов в массиве
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    count1++;

                }
            }
        }
        System.out.println(count1 / 2);
        // найти среднее число в массиве
        int mid = 0;
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        mid = array.length / 2;
        System.out.println(array[mid]);

*/

        // TODO:
        // 1.Найти сумму мин. и макс. элементов массива.
        int max = 0;
        int min = array[0];
        int sum;
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (max < array[i] && min > array[j]) {
                    max = array[i];
                    min = array[j];

                }
            }
        }
        sum = max + min;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);

        // 2.Найти сумму остатков от деления на 2. всех элементов массива.
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            double a = array[i];
            int b = (int) (a % 2);
            System.out.printf("%d ", b);
            sum1 += b;
        }
        System.out.println(" сумма остатка = " + sum1);


        // 3.Определить наличие дублирующихся элементов в массиве.
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    count++;
                }
            }
        }
        System.out.println(count);


        // 4.Перевернуть массив.
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}