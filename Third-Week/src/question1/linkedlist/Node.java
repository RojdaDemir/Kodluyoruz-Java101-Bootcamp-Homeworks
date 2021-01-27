package question1.linkedlist;

public class Node<T>{

	public T data;
	public Node<T> previous;
	public Node<T> next;
	
	public Node(T data) {
		
		this.data = data;
	}
	
	public void list() {
		
		System.out.println(this.data +" ");		
	}
	
}
