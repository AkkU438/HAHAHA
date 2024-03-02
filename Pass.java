import java.util.regex.*;
import java.io.*;
import java.util.Scanner;

public class Pass{
    
    public static boolean validatePassword(String password) {
        // Check if the length is between 8 and 16
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }
        
        // Check if the password contains at least three out of four categories
        int categoriesCount = 0;
        if (password.matches(".*[a-z].*")) { // Lowercase letters
            categoriesCount++;
        }
        if (password.matches(".*[A-Z].*")) { // Uppercase letters
            categoriesCount++;
        }
        if (password.matches(".*\\d.*")) { // Numbers
            categoriesCount++;
        }
        if (password.matches(".*[~!@#$%^&*()\\-=_+].*")) { // Special symbols
            categoriesCount++;
        }
        
        return categoriesCount >= 3;
    }
    
    public static void main(String[] args) {
        System.out.println("Please enter password");
        Scanner scanner1 = new Scanner(System.in);
        String pass = scanner1.nextLine();
        String[] passwords = {pass};
        
        for (String password : passwords) {
            System.out.println(password + " is valid: " + validatePassword(password));
        }
    }

    
}

