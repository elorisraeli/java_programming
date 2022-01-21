package PracticeBeforeExam;

public class MyLinkedList {

    private Node head, tail;
    private int size;

    public Node getTail(){
        return tail;
    }
    public Node getHead() {
        return head;
    }
    public Node getNodeAt(int i){
        Node temp = head;
        for (int j=0; j<i; j++){
            temp = temp.getNext();
        }
        return temp;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
		/*
		else {
			Node temp = head;
			while(temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(newNode);
		}
		 */
        size++;
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }

        size++;
    }

    public void addAt(int data, int i) {
        if (i == 0)
            addHead(data);
        else if (i == size)
            add(data);
        else {
            Node newNode = new Node(data);

            Node temp = head;
            for (int j = 0; j < i - 1; j++)
                temp = temp.getNext();

            newNode.setNext(temp.getNext());
            temp.setNext(newNode);

            size++;
        }

    }

    // if error returns MAX_VALUE
    public int at(int i) {
        if (i >= size) return Integer.MAX_VALUE;

        Node temp = head;
        for (int j = 0; j < i; j++)
            temp = temp.getNext();
        return temp.getData();
    }

    public int size() {
        return size;
    }

    public String toString() {
        String answer = "[";

        Node temp = head;
        while (temp != null) {
            answer = answer + temp.getData() + " ";
            temp = temp.getNext();
        }
        // make it looks better (get rid of the unnecessary last space).
        answer = answer.substring(0, answer.length()-1);
        // end with "]".
        answer += "]";
        return answer;
    }
}
