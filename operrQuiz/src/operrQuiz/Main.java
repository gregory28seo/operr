package operrQuiz;

public class Main {

	public static void main(String[] args) {	
		LinkedList l1 = new LinkedList();
		l1.append(new Node(2, null));
		l1.append(new Node(4, null));
		l1.removeTail();
		l1.append(new Node(10, null));
		l1.append(new Node(1, null));
		l1.append(new Node(3, null));	
		l1.removeGreaterThan(2);
		l1.print();		
	}

}
