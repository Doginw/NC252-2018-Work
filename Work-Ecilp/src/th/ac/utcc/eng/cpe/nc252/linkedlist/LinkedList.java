package th.ac.utcc.eng.cpe.nc252.linkedlist;

public class LinkedList {
	private DataItem first;
	private DataItem head;
	private int sum = 0;

	public LinkedList() {
		first = null;
		head = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(DataItem newDataItem) {
		if (first == null) {
			newDataItem.next = head;
			head = newDataItem;
			first = newDataItem;
			sum++;

		} else {
			newDataItem.next = first;
			first = newDataItem;
			head.next = first;
			sum++;
		}
	}

	public void deleteFirst() {
		DataItem current = first;
		DataItem pre = first;
		for (int j = 0; j < sum - 1; j++) {
			for (int i = 0; i < 4; i++) {
				pre = current;
				current = current.next;
			}
			System.out.println("\nDalete Node : " + current);

			if (current == head) {
				head = current.pr;
			} else if (current == first) {
				first = first.next;
			}
			pre.next = current.next;
			current.next.pr = current.pr;
			current = current.next;

			displayList();

		}

		System.out.println("\nLast Node : " + current);
		//return current;
	}

	public void displayList() {
		System.out.println("List:");
		DataItem current = first;
		while (current != null) {
			System.out.println(current);
			current = current.next;
			if (first == current) {
				// System.out.println(current);
				break;
			}

		}
	}

}
