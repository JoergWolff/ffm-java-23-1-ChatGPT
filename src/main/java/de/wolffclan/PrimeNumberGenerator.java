package de.wolffclan;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {
    public static List<Integer> generatePrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        int num = 2; // Starte bei der ersten Primzahl

        while (primeNumbers.size() < n) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
            num++;
        }

        return primeNumbers;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 10; // Anzahl der gewünschten Primzahlen
        List<Integer> primeNumbers = generatePrimeNumbers(n);

        System.out.println("Die ersten " + n + " Primzahlen sind:");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }
}
