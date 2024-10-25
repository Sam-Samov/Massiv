package by.sam.Massiv;

import java.util.ArrayList;

public class Calculation {

    public static void evenNumbers(int[] massive) { //чётные
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                evenList.add(massive[i]);
            }
        }
        for (int i = 0; i < evenList.size(); i++) {
            System.out.println("Список чётных чисел. Ячейка " + i + ": " + evenList.get(i));
        }
    }

    public static void oddNumbers(int[] massive) { //нечётные числа

    }

    public static void primeNumbers(int[] massive) { //простые числа
        ArrayList<Integer> primeList = new ArrayList<>();

    }



    public static int sumAll(int[] massive) { //сумма всех чисел
        _Main main = new _Main();
        int sum=0;
        for (int i = 0; i < massive.length; i++) {
            int previousSum = 0;
            sum = previousSum + massive[i];
            previousSum = sum;
        }
        System.out.println("Сумма всех чисел массива: " + sum);
        return sum;

    }

    public static void evenIndex(int[] massive) { // числа с нечётным индексом в массиве

    }

    public static void oddIndex(int[] massive) { // числа с чётным индексом в массиве

    }

    public static void subEvenOdd(int[] massive) { //разница сумм чисел с нечётным и чётным индексом в массиве

    }

    public static void zeroNumbers(int[] massive) { //количество нулей

    }
}