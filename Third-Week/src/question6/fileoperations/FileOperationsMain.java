package question6.fileoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Scanner;



public class FileOperationsMain {

	public static void main(String[] args) throws URISyntaxException, FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Öğrenci no : ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Öğrenci ismi :");
        String studentName = scanner.nextLine();
   
             
        System.out.println("Öğrencinin soyismi: ");
		String studentSurname = scanner.nextLine();
		
		System.out.println("Öğrencinin yaşı: ");
		int age = scanner.nextInt();
	
		scanner.nextLine();
		System.out.println("Öğrencinin bölümü: ");
        String department = scanner.nextLine();
        
        scanner.close();
        
		File file = new File("fileOperations/student.txt");
		FileOperations.write(file, studentNumber+"-"+studentName+" "+studentSurname+"-"+age+"-"+department+"\n");
			
		String content = FileOperations.read(new FileInputStream(file));
		System.out.println(content);

}
}