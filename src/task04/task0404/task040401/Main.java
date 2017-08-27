package task04.task0404.task040401;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> polynomFirst = new HashMap<>();
        HashMap<Integer, Integer> polynomSecond = new HashMap<>();
        HashMap<Integer, Integer> polynomResult = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter exponent of Polynomial: ");
        int exp = scanner.nextInt();
        inputData(polynomFirst, exp, "P");
        inputData(polynomSecond, exp, "Q");
        polynomResult = sumOfPolynomial(polynomFirst, polynomSecond);
        printPolynomial(polynomResult, "(P + Q)");
    }

    public static void inputData(HashMap<Integer, Integer> p, int exp, String name) {
        Scanner scanner = new Scanner(System.in);
        printDummyPolynomial(exp, name);
        System.out.println();
        for (int i = 0; i <= exp; i++) {
            System.out.print("a" + i + "=");
            p.put(i, scanner.nextInt());
        }
//        printPolynomial(p, name);
    }

    public static HashMap<Integer, Integer> sumOfPolynomial(HashMap<Integer, Integer> p1, HashMap<Integer, Integer> p2) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        for (int i = 0; i < p1.size(); i++) {
            result.put(i, p1.get(i) + p2.get(i));
        }
        return result;
    }

    public static void printDummyPolynomial(int size, String name) {
        System.out.print(name + " = a0");
        for (int i = 1; i <= size; i++) {
            System.out.print(" + a" + i + "*x^" + i);
        }
    }

    public static void printPolynomial(HashMap<Integer, Integer> p, String name) {
        System.out.print(name + " = " + p.get(0));
        for (int i = 1; i < p.size(); i++) {
            System.out.print(" + " + p.get(i) + "x^" + i);
        }
        System.out.println();
    }
}