package question7.inheritance;


public class Inheritance {

	public static void main(String[] args) {

		
		PersonelReport personelReport= new PersonelReport();
		
		personelReport.setName("Deniz");
		System.out.println("Adı: "+ personelReport.getName());
		
		String value = personelReport.hashMD5Result();
		System.out.println(value);
	    
		
		SalesReport salesReport = new SalesReport();
		salesReport.setName("Ayşe");
		System.out.println(salesReport.getName());
		
		String information ="Bilgi Teknolojileri";
		DatabaseOperations.open();
		DatabaseOperations.runQuery(information);
		
		Report report = new Report();
		report.setName("Rapor");
		Printer.print(report);
		
		}	
		
	}

