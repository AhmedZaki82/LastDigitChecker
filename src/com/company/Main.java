package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(9, 99, 99));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {

        if (!isValid(x) || !isValid(y) || !isValid(z)) {

            System.out.println("The number has to be more than 10 and less than 1000!");
            return false;

        }

        int count = 0;

        int f = 0;
        int s = 0;
        int t = 0;

        while (count < 2) {

            f = f * 10 + (x % 10);
            s = s * 10 + (y % 10);
            t = t * 10 + (z % 10);

            count++;
        }

        if (f == s || s == t || f == t) {

            System.out.println("Equal");
            return true;
        } else {

            System.out.println("No");
            return false;
        }
    }

    public static boolean isValid(int number) {

        if (number >= 10 && number <= 1000) {

            System.out.println("The number is valid.");
            return true;
        } else {

            System.out.println("The number is not valid!");
            return false;
        }
    }
}
