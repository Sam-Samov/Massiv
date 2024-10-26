package by.sam.Massiv;


import java.util.Arrays;

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
            if (massive[i] == 2) {
                System.out.println("Список простых чисел. Ячейка " + i + ": " + massive[i]);
            } else {
                if (massive[i] > 2 & primeCheck(massive[i])) {
                    System.out.println("Список простых чисел. Ячейка " + i + ": " + massive[i]);
                }
            }
        }
    }

    public static boolean primeCheck(int x) {
        int d = 2;
        if (d < Math.sqrt(x)) {
            while (x % d != 0) {
                d = d + 1;
            }
        }
        return d > Math.sqrt(x);
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

    }

    public static void zeroNumbers(int[] massive) { //количество цифры (не число!) 0 в массиве
        String str1 = Arrays.toString(massive);
        str1 = str1.replace(", ", "");
        str1 = str1.replace("[", "");
        str1 = str1.replace("]", "");
        int sum = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '0') {
                System.out.println("Ячейка с цифрой '0': " + i);
                sum++;
            }
        }
        if (sum > 0) {
            System.out.println("Количество цифр '0' в данном массиве: " + sum);
        } else System.out.println("Цифра '0' не встречается в данном массиве");
    }
}