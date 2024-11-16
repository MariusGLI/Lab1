package Problema4;
public class CmmdcCalculator {

    // Metodă pentru calcularea CMMDC folosind Algoritmul lui Euclid
    public int calculeazaCmmdc(int a, int b) {
        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }
}
