package Java_Basics.Lesson_5.HW;

public class Palindrome {

    public static void main(String[] args) {
        //2. Palindrome
        System.out.println("Palindrome: ");
        String word = "saippuakivikauppias"; //торговец щелоком (фин)
        System.out.println(word);
        Boolean isPalindrome = false;
        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
            char leftChar = word.charAt(i);
            char rightChar = word.charAt(j);
            if (leftChar == rightChar) {
                isPalindrome = true;
            } else {
                break;
            }
        }
        String message = isPalindrome ? "The word is palindrome" : "The word isn't palindrome";
        System.out.println("\n" + message);

    }
}
