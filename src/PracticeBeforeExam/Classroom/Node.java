package PracticeBeforeExam.Classroom;

public class Node {
    private Node next;
    private Node prev;
    private Student s;
    Node(Node next, Node prev, Student s){
        this.next = next;
        this.prev = prev;
        this.s = s;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Node{" +
                "prev=" + prev +
                ", s=" + s +
                ", next=" + next +
                '}';
    }
}
