package by.sam.Massiv;

import java.util.*;

public class _Main {
    public static void main(String[] args) {
        System.out.println("Введите длину создаваемого массива:");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        while (!sc.hasNextInt() | sc.hasNext("0")) {
            System.out.println("Введите целое число!");
            sc.next();
        }
        int lenght = sc.nextInt();
        int[] randomNumbers = new int[lenght];

        Random x = new Random();
        System.out.println("Введите нижнюю границу случайных чисел массива");
        while (!sc.hasNextInt()) {
            System.out.println("Введите целое число!");
            sc.next();
        }
        int minNumber = sc.nextInt();

        System.out.println("Введите верхнюю границу случайных чисел массива");

        while (!sc.hasNextInt()) {
            System.out.println("Введите целое число!");
            sc.next();
        }
        int maxNumber = sc.nextInt();

        sc.close();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = x.nextInt(minNumber, maxNumber);
        }

        System.out.println("Список всех чисел массива: " + Arrays.toString(randomNumbers));
        System.out.println();
        Calculation.evenNumbers(randomNumbers);
        System.out.println();
        Calculation.oddNumbers(randomNumbers);
        System.out.println();
        Calculation.primeNumbers(randomNumbers);
        System.out.println();
        Calculation.sumAll(randomNumbers);
        System.out.println();
        Calculation.evenIndex(randomNumbers);
        System.out.println();
        Calculation.oddIndex(randomNumbers);
        System.out.println();
        Calculation.subEvenOdd(randomNumbers);
        System.out.println();
        Calculation.zeroNumbers(randomNumbers);
        System.out.println();
        Calculation.sortMinMax(randomNumbers);
    }
}

