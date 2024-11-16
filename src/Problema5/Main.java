package Problema5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Generăm un număr aleatoriu între 0 și 20
        int numar = random.nextInt(21);
        System.out.println("Numărul generat este: " + numar);

        // Creăm un obiect de tip FibonacciChecker
        FibonacciChecker checker = new FibonacciChecker();

        // Verificăm dacă numărul generat aparține șirului lui Fibonacci
        if (checker.esteInFibonacci(numar)) {
            System.out.println("Numărul " + numar + " aparține șirului lui Fibonacci.");
        } else {
            System.out.println("Numărul " + numar + " nu aparține șirului lui Fibonacci.");
        }
    }
}

