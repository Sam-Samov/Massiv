package by.sam.Massiv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class _Main {
    public static void main(String[] args) {
        int[] random10Numbers = new int[10];

        Random x = new Random();
        for (int i = 0; i < 10; i++) {
            random10Numbers[i] = x.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(random10Numbers));
        evenNumbers(random10Numbers);
    }

    public static void evenNumbers(int[] massive) { //чётные
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (massive[i] % 2 == 0) {
                evenList.add(massive[i]);
            }
        }
        for (int i = 0; i < evenList.size(); i++) {
            System.out.println(evenList.get(i));
        }
    }

    public void oddNumbers(int random10Numbers) { //нечётные числа

    }

    public void primeNumbers(int random10Numbers) {

    }

    public void sumAll(int random10Numbers) {

    }

    public void evenIndex(int random10Numbers) { // числа с нечётным индексом в массиве

    }

    public void oddIndex(int random10Numbers) { // числа с чётным индексом в массиве

    }

    public void subEvenOdd(int random10Numbers) { //разница сумм чисел с нечётным и чётным индексом в массиве

    }

    public void zeroNumbers(int random10Numbers) { //количество нулей

    }
}
