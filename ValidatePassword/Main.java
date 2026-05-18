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
	  String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{9,}$";
        
        return password.matches(regex);
	}
}
