package question1.linkedlist;

public class LinkedListApplication {

	public static void main(String[] args) {
		
		//Bağlantılı liste veri yapısını koda dökemedim :( İnternetten baktım.
		UserLinkedList<Integer> liste = new UserLinkedList<Integer>();

		liste.firstAddList(22); 
		liste.firstAddList(44);
        liste.firstAddList(66);
        
		liste.lastAddList(11); 
		liste.lastAddList(33);
		liste.lastAddList(66);

		liste.printer(); 

		liste.firstRemove(); 
		liste.lastRemove();
		liste.selectRemove(11); 

        liste.printer();

		liste.addList(22, 77); 
		liste.addList(33, 88);

		liste.printer(); 
         
		
		UserLinkedList<String> liste1 = new UserLinkedList<String>();
		liste1.firstAddList("Derya");
		liste1.lastAddList("Deniz");
		liste1.printer();
	}

}
