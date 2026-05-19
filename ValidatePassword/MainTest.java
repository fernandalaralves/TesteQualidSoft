import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidatorTest {
    
    @Test
    public void testValidatePassword_ValidPassword() {
        Main main = new Main();
        
        assertTrue(main.validatePassword("@Fer12L@5"));
        assertTrue(main.validatePassword("@Al7$olaa%"));
        assertTrue(main.validatePassword("%100Fl@Lf"));
    }
    
    @Test
    public void testValidatePassword_TooShort() {
        Main main = new Main();
        
        assertFalse(main.validatePassword("Lara@12"));
        assertFalse(main.validatePassword("aB%c1"));
        assertFalse(main.validatePassword("bart1%"));
    }
    
    @Test
    public void testValidatePassword_NoUppercase() {
        Main main = new Main();
        
        assertFalse(main.validatePassword("fer722!@#$"));
        assertFalse(main.validatePassword("bartolomeu99@"));
        assertFalse(main.validatePassword("$%444heyyy"));
    }
    
    @Test
    public void testValidatePassword_NoLowercase() {
        Main main = new Main();
        
        assertFalse(main.validatePassword("!@97LARA#$"));
        assertFalse(main.validatePassword("#26LUX$9N"));
        assertFalse(main.validatePassword("123MACAS$%"));
    }
    
    @Test
    public void testValidatePassword_NoNumber() {
        Main main = new Main();
    
        assertFalse(main.validatePassword("!@#$Fla!O"));
        assertFalse(main.validatePassword("FernandaLara@"));
        assertFalse(main.validatePassword("$Ba#!rt%e"));
    }
    
    @Test
    public void testValidatePassword_NoSpecialChar() {
        Main main = new Main();
        
        assertFalse(main.validatePassword("bA33rTo11o"));
        assertFalse(main.validatePassword("auTomovel99"));
    }
    
    @Test
    public void testValidatePassword_EmptyOrNull() {
        Main main = new Main();
        
        assertFalse(main.validatePassword(""));
        assertFalse(main.validatePassword("   "));
    }
    
    @Test
    public void testValidatePassword_ValidWithDifferentSpecialChars() {
        Main main = new Main();
        
        assertTrue(main.validatePassword("@Ba311023"));
        assertTrue(main.validatePassword("#Japa$0001"));
        assertTrue(main.validatePassword("18S$d!f05"));
    }
}
