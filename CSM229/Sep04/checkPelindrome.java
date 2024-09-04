import java.util.Scanner;

public class checkPelindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Type the word and press return/enter to check if this is palindrome or not!");
        String word = scn.nextLine();

        scn.close();

        boolean isWordPelindrome = ispalindrome(word);

        System.out.println("Is the word: " + word + " a palindrome: " + isWordPelindrome);
    }

    private static boolean ispalindrome(String word) {

        // write your code here!
        return false;
    }
}
