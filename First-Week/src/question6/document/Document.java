package question6.document;

public class Document {

	public static void main(String[] args) {
		
		PDFDocument document1 = new PDFDocument("JavaKalıtım.pdf");
	    Printer.printPDFDocument(document1);
	    
	    WordDocument document2 = new WordDocument("JavaKalıtım.doc");
	    Printer.printWordDocument(document2);
	    
	    
	}

}
