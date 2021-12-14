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
}