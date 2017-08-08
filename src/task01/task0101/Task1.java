package task01.task0101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--[ Converting Number (Decimal -> Bin, Oct, Hex) ]--");
        System.out.println("Please input Number : ");
        int number = Integer.parseInt(reader.readLine());
/*
// for testing purpose
        System.out.println("auto-convert (binary)  : " + Integer.toBinaryString(boardNumber));
        System.out.println("auto-convert (octal)   : " + Integer.toOctalString(boardNumber));
        System.out.println("auto-convert (hex)     : " + Integer.toHexString(boardNumber));
*/
        System.out.println("Result:");
        System.out.print("decimal -> binary  : ");
        convertToBinary(number);
        System.out.print("decimal -> octal   : ");
        convertToOctal(number);
        System.out.print("decimal -> heximal : ");
        convertToHex(number);
    }

    public static void convertToBinary(int val) {
        String str = "";
        if (val == 0) str = 0 + str;
        while (val > 0) {
            str = (val % 2) + str;
            val = val / 2;
        }
        System.out.println(str);
    }

    public static void convertToOctal(int val) {

        String str = "";
        if (val == 0) str = 0 + str;
        while (val > 0) {
            str = (val % 8) + str;
            val = val / 8;
        }
        System.out.println(str);
    }

    public static void convertToHex(int val) {
        String str = "";
        if (val == 0) str = 0 + str;
        while (val > 0) {
            switch (val % 16) {
                case 10:
                    str = 'a' + str;
                    break;
                case 11:
                    str = 'b' + str;
                    break;
                case 12:
                    str = 'c' + str;
                    break;
                case 13:
                    str = 'd' + str;
                    break;
                case 14:
                    str = 'e' + str;
                    break;
                case 15:
                    str = 'f' + str;
                    break;
                default:
                    str = (val % 16) + str;
                    break;
            }
            val = val / 16;
        }
        System.out.println(str);
    }
}
