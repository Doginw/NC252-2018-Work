package LInkList;

public class LinkedList {
	private DataItem first;
	private int ID  = 6;
	
	
	public LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(DataItem newDataItem) {
		newDataItem.next = first;			
		first = newDataItem;
		first.Key = this.ID;
		ID--;
		
		first.Work.trim();
		first.Discussion.trim();
		
		
	}
	
	public DataItem deleteFirst() {
		DataItem temp = first.next;
		DataItem previous = first;		
		
		//����
		while (temp.Key != 4) {
			
			if (temp.next == null)				
				return null;
			else {
				previous = temp;
				temp = temp.next;
				}
			}
		
		if(temp == first)
			first = first.next;
		else 
			previous.next = temp.next;
		
	
		
		return temp;
	
	}
	
	public DataItem deleteFirst(int key) {
		DataItem temp = first.next;
		DataItem previous = first;		
		
		
		while (temp.Key != key) {
			
			if (temp.next == null) {				
				return null;}
			else {
				previous = temp;
				temp = temp.next;
				}
			}
		
		if(temp == first)
			first = first.next;
		else 
			previous.next = temp.next;
		
	
		
		return temp;
	
	}
	public int getID() {
		return this.ID;
	}
	
	public void setID() {
		DataItem current = first;
		ID = 0;		
		while( current != null ) {
			current.Key = ID;
			ID++;
			current = current.next;			
		}
		
			
		
	}
	
	public void displayList() {
		System.out.println("List:");
		DataItem current = first;
		while( current != null ) {
			System.out.println(current.toString());
			current = current.next;
		}
	}
	
	

}
