package question3.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class StudentApplication {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		Map<Integer, List<Student>> studentList = new HashMap<Integer,List<Student>>();
	
		
		System.out.println("Öğrencinin numarasını giriniz:");
		int studentNumber = input.nextInt();
		input.nextLine();
		
		System.out.println("Öğrencinin adı: ");
		String studentName = input.nextLine();
		
		System.out.println("Öğrencinin soyadı:");
		String studentSurName = input.nextLine();
		
		System.out.println("Öğrencinin bölümü: ");
		String studentDepartment = input.nextLine();
		
		System.out.println("Öğrencinin yaşı: ");
		int studentAge = input.nextInt();
		
		input.close();
		

		Student student = new Student(studentName,studentSurName,studentDepartment,studentAge);
		student.setNumber(studentNumber);
		
			
		studentList.put(student.getNumber(), Arrays.asList(new Student(student.getName(),student.getSurName(),
				                              student.getDepartment(),student.getAge())));
		System.out.println(studentList);
		
	}
		
}


