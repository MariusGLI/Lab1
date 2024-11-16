package Problema5;

public class FibonacciChecker {

    // Metodă pentru a verifica dacă un număr este pătrat perfect
    private boolean estePatratPerfect(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    // Metodă pentru a verifica dacă un număr aparține șirului lui Fibonacci
    public boolean esteInFibonacci(int n) {
        // Verificăm dacă 5*n^2 + 4 sau 5*n^2 - 4 este pătrat perfect
        return estePatratPerfect(5 * n * n + 4) || estePatratPerfect(5 * n * n - 4);
    }
}

