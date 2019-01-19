package BinaryTrees;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		root = null;
	}

	public void find(int key) {
		Node current = root;
		while (current.ID != key) {
			if (key < current.ID) {
				current = current.left;
			} else {
				current = current.right;
			}
			if (current == null) {
				System.out.println("Find not found");
				break;
			}
		}
	}

	public void insert(int ID, String name, String grade) {
		Node newNode = new Node();
		newNode.ID = ID;
		newNode.name = name;
		newNode.grade = grade;
		if (root == null)
			root = newNode;
		else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (current.ID < ID) {
					current = current.left; // -----------
					if (current == null) {
						parent.left = newNode;
						break;
					}

				} else {
					current = current.right; // -----------
					if (current == null) {
						parent.right = newNode;
						break;
					}
				}

			}
		}
		System.out.println("-------- Insert -------");
		System.out.println("\nID :" + newNode.ID + "\nName : " + newNode.name + "\nGrade : " + newNode.grade);

	}

	public void delete(int key) {
		Node current = root;
		Node parent;
		boolean isLeftChild = true;
		while (current.ID != key) {
			parent = current;
			if (key < current.ID) {
				isLeftChild = true;
				current = current.left;
			} else {
				isLeftChild = false;
				current = current.right;
			}
			if (current == null) {
				break;
			}
			// กรณี ไม่มีลูก
			if (current.left == null && current.right == null) {
				if (current == root) {
					root = null;
				} else if (isLeftChild) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (current.right == null) { // กรณีมีลูก 1 โหนด
				if (current == root) {
					root = current.left;
				} else if (isLeftChild) {
					parent.left = current.left;
				} else {
					parent.right = current.left;
				}
			} else if (current.left == null) {
				if (current == root) {
					root = current.right;
				} else if (isLeftChild) {
					parent.left = current.right;
				} else {
					parent.right = current.right;
				}
			} else {//มีลูก 2 โหนด
				Node successor = getSuccessor(current);
				if (current == root) {
					root = successor;
					successor.left = current.left;
				} else if (isLeftChild) {
					parent.left = successor;
				} else {
					parent.right = successor;
					successor.left = current.left;
				}
			}
		}
		System.out.println("-------- Delete " + key + " is Done --------");

	}

	public Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.right;
		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.left;
		}
		if (successor != delNode.right) {
			successorParent.left = successor.right;
			successor.right = delNode.right;
		}
		return successor;
	}

	public void upGrade(int key, String grade) {
		Node current = root;
		while (current.ID != key) {
			if (key < current.ID) {
				current = current.left;
			} else {
				current = current.right;
			}
			if (current == null) {
				System.out.println("Find not found");
				break;
			}
		}
		System.out.print("-------- Upgrade is Done ------------");

	}

	public void diplay() {
		Node dP = root;
		System.out.print(dP);
	}

	public static void main(String args[]) {
		BinaryTree d1 = new BinaryTree();
		d1.insert(1568, "Judi", "2.1");
		d1.insert(1598, "Sadu", "3.8");
		d1.insert(3250, "Momo", "1.2");

		d1.delete(1598);
		d1.upGrade(1568, "2.5");

	}
}
