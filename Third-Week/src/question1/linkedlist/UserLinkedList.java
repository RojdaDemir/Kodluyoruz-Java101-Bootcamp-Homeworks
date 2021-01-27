package question1.linkedlist;

public class UserLinkedList<T> {

	private Node first;
	private Node last;
	
	public UserLinkedList() {
		
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		
		return first == null;
	}
	
	public <T> void firstAddList(T value) {
		
		Node newNode = new Node(value);
		
		if(this.isEmpty()) {
		
			last = newNode;
		}
		else {
			
			first.previous = newNode;
			newNode.next = first;
			first = newNode;
		}
		
    }

	public <T> void lastAddList(T value) {
		
		Node newNode = new Node(value);
		
		if(this.isEmpty()) {
			
			first = newNode; 
		}
			else {
				last.next = newNode; 
				newNode.previous = last;
			}
			last = newNode; 
	}
	
	public Node firstRemove() 
	{
		Node temp = first;
		if (first.next == null) {
			
			last = null;
		}
		else {
			first.next.previous = null; 
		}
		    first = first.next;
		    return temp;
	   }
	
	public Node lastRemove() 
	{ 
		Node temp = last;
		if (first.next == null) {
			first = null;
		}
		else {
			last.previous.next = null;
		     } 
		    last = last.previous;
            return temp;
	}

	public <T> boolean addList(T key, T value) { 
		Node active = first;
		while (active.data != key) 
		{
			active = active.next; 
			if (active == null)
				return false;
		}
		Node newNode = new Node(value); 

		if (active == last) 
		{
			newNode.next = null;
			last = newNode;
		} else
		{
			newNode.next = active.next; 
						
			active.next.previous = newNode;
		}
		newNode.previous = active; 
		active.next = newNode;
		return true; 
	}

	public <T> Node selectRemove(T key) 
	{ 
		Node active = first; 
		while (active.data != key) 
		{
			active = active.next;
			if (active == null)
				return null;
		}
		if (active == first) 
			first = active.next; 
		else 
				
			active.previous.next = active.next;

		if (active == last) 
			last = active.previous; 
		else {
			
			active.next.previous = active.previous;
		}
		    return active;
	}
	
	public void printer() {
		System.out.print("Liste : ");
		Node active = first;
		while (active != null) 
		{
			active.list(); 
			active = active.next; 
		}
		System.out.println("");
	}
	
	
	
	}	

