import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class checkPelindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Type the word and press return/enter to check if this is palindrome or not!");
        String word = scn.nextLine();

        scn.close();

        // boolean isWordPelindrome = ispalindrome(word);
        boolean isWordPelindrome = isPalindromeUsingStackAndQueue(word);

        System.out.println("Is the word: " + word + " a palindrome: " + isWordPelindrome);
    }

    private static boolean ispalindrome(String word) {

        int length = word.length();
        for (int i = 0; i < length; i++) {
            Character c0 = word.charAt(i);
            Character c1 = word.charAt(length - i - 1);
            if (c0 != c1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeUsingStackAndQueue(String word){
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();

        for(char c : word.toCharArray()){
            stack.push(c);
            queue.add(c);
        }

        while(!stack.isEmpty()){
            char c0 = stack.pop();
            char c1 = queue.poll();
            if(c0!= c1){
                return false;
            }
        }
        return true;
    }
}
