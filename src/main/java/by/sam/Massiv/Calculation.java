package by.sam.Massiv;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculation {

    public static void evenNumbers(int[] massive) { //чётные числа
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                System.out.println("Список чётных чисел. Ячейка " + i + ": " + massive[i]);
            }
        }
    }

    public static void oddNumbers(int[] massive) { //нечётные числа
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 1) {
                System.out.println("Список нечётных чисел. Ячейка " + i + ": " + massive[i]);
            }
        }
    }

    public static void primeNumbers(int[] massive) { //простые числа
        for (int i = 0; i < massive.length; i++) {
                if (primeCheck(massive[i])) {
                    System.out.println("Список простых чисел. Ячейка " + i + ": " + massive[i]);
                }
        }
    }

    public static boolean primeCheck(int x) {
        int d = 2;
        if (x > 2 & d < Math.sqrt(x)) {
            while (x % d != 0) {
                d++;
            }
        }
        return d > Math.sqrt(x) | x == 2;
    }

    public static void sumAll(int[] massive) { //сумма всех чисел
        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            sum = sum + massive[i];
        }
        System.out.println("Сумма всех чисел массива: " + sum);
    }

    public static void evenIndex(int[] massive) { // числа с нечётным индексом в массиве
        for (int i = 0; i < massive.length; i++) {
            i++;
            if (i < massive.length) {
                System.out.println("Список чисел с нечётным индексом. Ячейка " + i + ": " + massive[i]);
            }
        }
    }

    public static void oddIndex(int[] massive) { // числа с чётным индексом в массиве
        for (int i = 1; i < massive.length; i++) {
            i++;
            if (i < massive.length) {
                System.out.println("Список чисел с чётным индексом. Ячейка " + i + ": " + massive[i]);
            }
        }
    }

    public static void subEvenOdd(int[] massive) { //разница сумм чисел с нечётным и чётным индексом в массиве
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                evenList.add(massive[i]);
            }
        }
        int sumEven = 0;
        for (int i = 0; i < evenList.size(); i++) {
            sumEven = sumEven + evenList.get(i);
        }
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0) {
                oddList.add(massive[i]);
            }
        }
        int sumOdd = 0;
        for (int i = 0; i < oddList.size(); i++) {
            sumOdd = sumOdd + oddList.get(i);
        }
        int x = sumEven;
        int y = sumOdd;
        int sub = x - y;
        System.out.println("Сумма нечётных чисел: " + x + ". Сумма чётных чисел: " + y + ". Разница: " + sub);
    }

    public static void zeroNumbers(int[] massive) { //количество цифр (не чисел!) "0" в массиве
        String str1 = Arrays.toString(massive);
        System.out.println(str1);
        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '0') {
                sum++;
            }
        }
        if (sum > 0) {
            System.out.println("Количество цифр '0' в данном массиве: " + sum);
        } else System.out.println("Цифра '0' не встречается в данном массиве");
    }

    public static void sortMinMax (int[] massive) { //сортировка массива от min к max
        int[] sorted = new int[massive.length];
        int[] clone = massive.clone();
        int min = 0;
        for (int i = 0; i < sorted.length; i++) {
            int itemForDel = 0;
            min = clone[0];
            for (int j = 1; j < clone.length; j++) {
                if (min > clone[j]) {
                    min = clone[j];
                    itemForDel = j;
                }
            }
            clone = delItemMassive(clone, itemForDel);
            sorted[i] = min;
        }
        System.out.println("Исходный массив: " + Arrays.toString(massive));
        System.out.println("Отсортированный от min к max массив: " + Arrays.toString(sorted));
    }

    public static int[] delItemMassive (int[] massive, int delIndex) { //удалятор элемента с заданным индексом из массива
        int [] newMassive = new int[massive.length-1];
        for (int i = 0; i < massive.length; i++) {
                if (i < delIndex) {
                    newMassive[i] = massive[i];
                } else if (i != delIndex) {
                    newMassive[i-1] = massive[i];
                }
        }
        return newMassive;
    }
}