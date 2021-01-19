package question6.document;

public class Printer {

    // Static metot kullanmamızın sebebi direkt sınıf üzerinde erişebilmemizdir.
	// Sınıfa ait bir metottur.Nesne tanımlamamıza gerek yoktur.
	
	public static void printPDFDocument(PDFDocument document) {
		
		System.out.println(document.getBody());
		
	}
	
	public static void printWordDocument(WordDocument document) {
		
		System.out.println(document.getBody());
	}
	
}
