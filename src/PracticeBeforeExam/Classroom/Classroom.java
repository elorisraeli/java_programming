package PracticeBeforeExam.Classroom;

public class Classroom {
    private Node head;
    private Node tail;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void add(Student s){
        Node newNode = new Node(null, tail, s);
        if (head == null) {
            head = newNode;
        }
        else {
            tail.setNext(newNode);
        }
        tail = newNode;

        size++;
    }

    public void remove(Student s){
        Node temp = head;
        while (temp!=null){
            if (temp.getS().getId() == s.getId()){
                temp.getNext().setPrev(temp.getPrev());
                temp.getPrev().setNext(temp.getNext());
                temp.setNext(null);
                temp.setPrev(null);
                break;
            }
            temp = temp.getNext();
        }
        size--;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
