package Unidad7Caso2;

import java.util.Scanner;

public class PasswordGenerator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        while (!(password = input.nextLine()).equals("end")) {
            if (isValidPassword(password)) {
                System.out.println(password + " es aceptable");
            } else {
                System.out.println(password + " no es aceptable");
            }
        }
    }
    
    public static boolean isValidPassword(String password) {
        char[] passwordChars = password.toCharArray();
        boolean hasVowel = false;
        char prevChar = passwordChars[0];
        char prevPrevChar = passwordChars[0];
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < passwordChars.length; i++) {
            char c = passwordChars[i];
            if (isVowel(c)) {
                hasVowel = true;
                vowelCount++;
                consonantCount = 0;
            } else {
                vowelCount = 0;
                consonantCount++;
            }
            if (vowelCount >= 3 || consonantCount >= 3) {
                return false;
            }
            if (i > 0 && c == prevChar && c != 'e' && c != 'o') {
                return false;
            }
            prevPrevChar = prevChar;
            prevChar = c;
        }
        return hasVowel;
    }
    
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}