import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScannerTest {
    @Test
    public void isValidEmailAddressTest() {
        assertTrue(Scanner.isValidEmailAddress("maalonsog@correo.url.edu.gt"));
        assertTrue(Scanner.isValidEmailAddress("test.administracion@dominio.gt"));
        assertTrue(Scanner.isValidEmailAddress("test-administracion@dominio.gt"));
        assertFalse(Scanner.isValidEmailAddress("test"));
        assertFalse(Scanner.isValidEmailAddress("test@prueba"));
    }

    @Test
    public void isValidURLTest(){
        assertTrue(Scanner.isValidURL("www.google.c"));
        assertTrue(Scanner.isValidURL("http://www.google.com"));
        assertTrue(Scanner.isValidURL("https://www.google.com"));
        assertTrue(Scanner.isValidURL("url.edu.gt"));
    }

    @Test
    public void isValidIPv4Adress(){
        assertTrue(Scanner.isValidIP("192.168.0.1"));
        assertTrue(Scanner.isValidIP("200.130.0.255"));
        assertTrue(Scanner.isValidIP("0.0.0.0"));
        assertTrue(Scanner.isValidIP("255.255.255.255"));
        assertFalse(Scanner.isValidIP("255.256.255.255"));
        assertFalse(Scanner.isValidIP("300.1.255.255"));
        assertFalse(Scanner.isValidIP("999.1.255.255"));
        assertFalse(Scanner.isValidIP("200.1.255"));
        
    }
}
