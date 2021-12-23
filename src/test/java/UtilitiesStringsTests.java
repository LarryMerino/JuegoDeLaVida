package src.test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import src.main.java.UtilitiesStrings;

import org.junit.jupiter.api.Test;

class UtilitiesStringsTests {
    
    @Test
    void testIsValidBoardExtension(){
        assertEquals(true, UtilitiesStrings.isValidBoardExtension(" 4 "));
        assertEquals(false, UtilitiesStrings.isValidBoardExtension(" "));
        assertEquals(false, UtilitiesStrings.isValidBoardExtension("  "));
        assertEquals(false, UtilitiesStrings.isValidBoardExtension(" x "));
        assertEquals(false, UtilitiesStrings.isValidBoardExtension(""));
        assertEquals(false, UtilitiesStrings.isValidBoardExtension(" 4 4"));
        assertEquals(false, UtilitiesStrings.isValidBoardExtension(" 4 4 "));
    }
}
