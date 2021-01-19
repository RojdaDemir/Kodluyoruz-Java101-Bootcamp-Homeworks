package question1.comparison;

import java.util.Scanner;


public class ComparisonApplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		System.out.println("Lütfen bir şifre giriniz: ");
		String password1 = input.next();
		
		boolean bool = passwordControl(password1);	
		
	        if(bool) 
			System.out.println("Giriş başarılıdır.");
	
	        else
			System.out.println("Giriş başarısızdır.");
		
		  input.close();
	}

	
	 private static boolean passwordControl(String passWord) {
		 
		 String fixedPassword = "8954";
		 
		 if(passWord.equals(fixedPassword))
			 return true;
		 else
			 return false;
	 }
	
}
