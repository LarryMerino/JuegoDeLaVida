package src.main.java;
/*
** Utilidades para poder trabajar con los Strings
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UtilitiesStrings {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() throws RuntimeException {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Necesita ser un número natural y el cero no está incluido
    public static boolean isValidBoardExtension(String input) {
        if (input.isBlank()) return false;
        String trimInput = input.trim();
        if (hasCharacters(trimInput) || hasSpacesInBetween(trimInput)) return false;
        int integerTrimInput = Integer.parseInt(trimInput);
        if (integerTrimInput < 1) return false;
        return true; 
    }

    public static boolean hasCharacters(String trimInput) {
        char[] trimInputArray = trimInput.toCharArray();
        for(char c : trimInputArray){
            if (!Character.isDigit(c)) return true;
        }
        return false;
    }

    public static boolean hasSpacesInBetween(String trimInput) {
        char[] trimInputArrray = trimInput.toCharArray();
        for(char c : trimInputArrray){
            if (Character.isWhitespace(c)) return true;
        }
        return false;
    }
}