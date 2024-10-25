package by.sam.Massiv;

import java.util.*;

public class _Main {
    public static void main(String[] args) {
        System.out.println("Введите длину создаваемого массива:");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        while (!sc.hasNextInt()) {
            System.out.println("Введите целое число!");
            sc.next();
        }
        int lenght = sc.nextInt();
        int[] randomNumbers = new int[lenght];

        Random x = new Random();
        System.out.println("Введите нижнюю границу случайных чисел массива");
        int minNumber = sc.nextInt();
        System.out.println("Введите верхнюю границу случайных чисел массива");
        int maxNumber = sc.nextInt();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = x.nextInt(minNumber, maxNumber);
        }

        System.out.println("Список всех чисел массива: " + Arrays.toString(randomNumbers));// !здесь вывести числа вторым способом
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
    }
}

