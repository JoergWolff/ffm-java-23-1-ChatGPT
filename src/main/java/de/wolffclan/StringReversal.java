package de.wolffclan;
public class StringReversal {
    public static String reverseString(String input) {
        // Überprüfen, ob die Eingabe null ist
        if (input == null) {
            return null;
        }
        
        // Erstelle einen leeren StringBuilder, um das umgekehrte Ergebnis zu speichern
        StringBuilder reversed = new StringBuilder();
        
        // Iteriere rückwärts durch die Zeichenkette und füge jedes Zeichen zum StringBuilder hinzu
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
        // Wandele den StringBuilder in einen String um und gib ihn zurück
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hallo";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Umgekehrt: " + reversed);
    }
}