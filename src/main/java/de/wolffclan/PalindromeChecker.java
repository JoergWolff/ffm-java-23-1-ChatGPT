package de.wolffclan;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Überprüfen, ob die Eingabe null oder leer ist
        if (input == null || input.isEmpty()) {
            return false;
        }
        
        // Entfernen von Leerzeichen und Umwandlung in Kleinbuchstaben (nicht zwischen Groß- und Kleinbuchstaben unterscheiden)
        input = input.replaceAll("\\s", "").toLowerCase();
        
        // Verwende zwei Zeiger, um das Zeichen in der Zeichenkette zu vergleichen
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false; // Wenn die Zeichen nicht übereinstimmen, ist es kein Palindrom
            }
            left++;
            right--;
        }
        
        return true; // Wenn alle Zeichen übereinstimmen, handelt es sich um ein Palindrom
    }

    public static void main(String[] args) {
        String palindrome = "anna";
        String notPalindrome = "hello";
        
        System.out.println("Ist \"" + palindrome + "\" ein Palindrom? " + isPalindrome(palindrome));
        System.out.println("Ist \"" + notPalindrome + "\" ein Palindrom? " + isPalindrome(notPalindrome));
    }
}
