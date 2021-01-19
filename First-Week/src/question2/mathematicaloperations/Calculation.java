package question2.mathematicaloperations;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    
		String answer = null;
		
		do {
	     	
		showMenu();
	
	    int choice = input.nextInt();
	    
		System.out.println("Birinci sayıyı giriniz: ");
		int number1 = input.nextInt();
		
		System.out.println("İkinci sayıyı giriniz: ");
		int number2 = input.nextInt();
		
		calculate(choice,number1,number2);
		
		System.out.println("İşleme devam etmek istiyor musunuz?(Evet/Hayır)");
		answer = input.next();
		
		}
		while(answer.toLowerCase().equals("evet"));
		
		System.out.println("Cevabınız hayır olduğu için burada bitmiştir.");
		
		input.close();
	}
	
	public static void showMenu() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("1-Toplama ");
		builder.append("2-Çıkarma ");
		builder.append("3-Çarpma ");
		builder.append("4-Bölme");
	    System.out.println(builder.toString());
	    System.out.println("Yapmak istediğiniz işlemi seçiniz:");
	}
	
	public static void calculate(int choice, int number1 , int number2) {
		
		
		switch(choice) {
		
		case 1 : String topla =String.format("%d + %d = %d ", number1, number2, number1+number2);
		         System.out.println(topla);
		         break;
		case 2 : String cikar = String.format("%d - %d = %d ", number1, number2, number1-number2);
		         System.out.println(cikar);
		         break;
		case 3 : String carp =String.format("%d * %d = %d ", number1, number2, number1*number2);
		         System.out.println(carp);
		         break;
		case 4 : String bol = String.format("%d / %d = %d",  number1, number2 , number1/number2);
		         System.out.println(bol);
		         break;
		default: System.out.println("Lütfen doğru bir seçim işlemi yapınız!");
		         break;
	   }
		
		
	}
	
	
}
