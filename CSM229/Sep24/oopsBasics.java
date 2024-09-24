package K23UP.CSM229.Sep24;

import java.util.Scanner;

public class oopsBasics {

    public static void main(String[] args) {
        System.out.println("please enter a number n:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) { // TC => O(n)*O(num) num will be concidered as n the result will be O(n^2)
            boolean isIPrime = isPrime(i); // TC => O(num)

            if (isIPrime) {
                System.out.println(i);
            }
        }
        scn.close();
    }

    private static boolean isPrime(int i) { // TC => O(i)
        int factCount = countFactors(i); // TC => O(i)
        if (factCount == 2) {
            return true;
        }
        return false;
    }

    private static int countFactors(int num) { // TC => O(num)
        int count = 2;
        for (int i = 2; i*i <= num; i++) { // TC => O(num)
            if (num % i == 0) {
                count = count + 2;
            }
        }
        return count;
    }
}

// factors of        9 = 1, 3, 9
// counter factors ->    9, 3, 1
// factors of        12 = 1, 2, 3, 4, 6, 12
// counter factors ->     12, 6, 4, 3, 2, 1