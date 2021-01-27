package question4.insurancecompany;

import java.util.Date;
import java.util.Scanner;

import question4.insurancecompany.User.User;
import question4.insurancecompany.account.AccountManager;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    createUser();
		
		System.out.println("Please enter your email: ");
		String email = input.next();
		
		System.out.println("Please enter your password: ");
		String password = input.next();
		
		
		AccountManager manager = new AccountManager();
		manager.login(email, password);
		
		input.close();
	}
	
	
	private static User createUser() {
		
		User user = new User();
		user.setIsim("Deniz");
		user.setSoyisim("Yılmaz");
		user.setMeslek("Ressam");
		user.setYas(30);
        user.setEmail("deniz.yilmaz@gmail.com");
        user.setSifre("1234");
        user.setSistemeSonGirisTarihi(new Date());
        user.setSistemeSonGirisTarihi(new Date());
        
        return user;
		
	}
	
	

}
