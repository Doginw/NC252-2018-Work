package Dicaionary;

public class Nods {
	private Data table[];
	private int sizeArray;

	public Nods() {
	}

	public Nods(int sizeArray) {
		this.sizeArray = sizeArray;
		table = new Data[sizeArray];
	}

	public void insert(String work, String discussion) {
		Data t = new Data(work, discussion);
		t.next = table[hashFunion(work)];
		table[hashFunion(work)] = t;

	}

	public void find(String key) {
		Data current = table[hashFunion(key)];
		boolean chick = true;
		while (!current.getWork().equals(key)) {
			if (current.next == null) {
				System.out.println("\nFind not found\n");
				chick = false;
				break;
			} else
				current = current.next;
		}
		if (chick)
			System.out.println("\n" + current.toString() + "\n");
	}

	public int hashFunion(String key) {
		int c = 0;
		for (int i = 1; i < key.length(); i++) {
			int h = key.charAt(i) - 96;
			c = (c * 27 + h) % this.sizeArray;
		}
		return c;
	}

	

	public void display() {
		int i = 0;
		while (i != table.length) {
			Data current = table[i];
			if (current == null) {
				i++;
			} else {
				System.out.println(current.work + " " + current.discussion);
			}
			i++;
		}
	}

}
