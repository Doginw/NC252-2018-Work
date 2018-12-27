package LInkList;

public class LinkedListApp {

	public LinkedListApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		DataItem N1 = new DataItem("Number 6","Fds"); // iD 6
		
		
		l.insertFirst(N1);
		
		
		l.displayList();
		
		
		/*
		LinkedList linkedList = new LinkedList();
		
		
		
		DataItem item1 = new DataItem("Calculus I", 4.0);
		DataItem item2 = new DataItem("Physics I", 3.5);
		DataItem item3 = new DataItem("English", 3.0);
		DataItem item4 = new DataItem("Thai", 2.5);
		
		linkedList.insertFirst(item1);
		linkedList.insertFirst(item2);
		linkedList.insertFirst(item3);
		linkedList.insertFirst(item4);

		linkedList.displayList();
		
		linkedList.deleteFirst();
		System.out.println("\nAfter deleteFirst()#1");
		linkedList.displayList();
		
		linkedList.deleteFirst();
		System.out.println("\nAfter deleteFirst()#2");
		linkedList.displayList();*/
	}

}
