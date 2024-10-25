package by.sam.Massiv;



public class Calculation {

    public static void evenNumbers(int[] massive) { //чётные
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                System.out.println("Список чётных чисел. Ячейка " + i + ": " + massive[i]);
            }
        }
    }

    public static void oddNumbers(int[] massive) { //нечётные числа

    }

    public static void primeNumbers(int[] massive) { //простые числа


    }



    public static void sumAll(int[] massive) { //сумма всех чисел
        int sum=0;
        for (int i = 0; i < massive.length; i++) {
            int previousSum = 0;
            sum = previousSum + massive[i];
            previousSum = sum;
        }
        System.out.println("Сумма всех чисел массива: " + sum);
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