package operrQuiz;

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
	}
	
	public LinkedList(Node head) {
		this.head = head;
	}

	public Node append(Node n) {
		if (head == null) {
			head = n;
			return head;
		}
		Node runner = head;
		while(runner.next != null) {
			runner = runner.next;
		}
		runner.next = n;
		return head;
	}
	
	public void removeTail() {
		if (head == null) {
			return;
		}
		Node runner = head, prev = null;
		while(runner.next != null) {
			prev = runner;
			runner = runner.next;
		}
		if (prev != null) {
			prev.next = null;
		} else {
			head = null;
		}
	}
	
	public void removeGreaterThan(int x) {
		if (head == null) {
			return;
		}
		Node runner = head, prev = null;
		while(runner != null) {
			if (runner.value > x) {
				if (prev != null) {
					prev.next = runner.next;
				} else {
					head = runner.next;
				}	
			} else {
				prev = runner;
			}
			runner = runner.next;
		}
	}
	
	public void print() {
		Node runner = head;
		while(runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
	}

}
