import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("digite sua senha: ");
		String password = scanner.nextLine();
		
		if (validatePassword(password))
		{
		    System.out.println("senha aceita!");
		} else {
		    System.out.println("senha negada!");
		}
	}
	
	public static boolean validatePassword(String password)
{
    if (password.length() < 9) {
        return false;
    }
    
        boolean  uppercase = false;
        boolean  lowercase = false;
        boolean  specialCharacter = false;
        boolean  digit = false;
        
        for(char c : password.toCharArray()) 
        {
            if(Character.isUpperCase(c)){
                uppercase = true;
            } else if (Character.isLowerCase(c)){
                lowercase = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            } else if (!Character.isLetterOrDigit(c)){
                specialCharacter = true;
            }
        }
        
        return uppercase && lowercase && digit && specialCharacter;
}
    
}
