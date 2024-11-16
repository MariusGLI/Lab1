package Problema4;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Generăm două numere aleatorii între 1 și 30
        int numar1 = random.nextInt(30) + 1;
        int numar2 = random.nextInt(30) + 1;

        System.out.println("Numerele generate sunt: " + numar1 + " și " + numar2);

        // Creăm un obiect de tip CmmdcCalculator
        CmmdcCalculator calculator = new CmmdcCalculator();

        // Calculăm CMMDC pentru cele două numere generate
        int cmmdc = calculator.calculeazaCmmdc(numar1, numar2);

        System.out.println("CMMDC al numerelor " + numar1 + " și " + numar2 + " este: " + cmmdc);
    }
}
