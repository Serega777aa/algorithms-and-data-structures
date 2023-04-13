public class Hw3 {

    public static void main(String[] args) {
        MyList ml = new MyList();
        ml.addLast("Раз");
        ml.addLast("Два");
        ml.addLast("Три");
        ml.reverse();
        var item = ml.head;

        while (item != null) {
            System.out.print(item + " ");
            item = item.getNext();
        }
    }
}

class MyList {
    Node head;

    public void reverse() {
        if (head != null && head.getNext() != null) {
            Node tmp = head;
            reverse(head.getNext(), head);
            tmp.setNext(null);
        }
    }

    private void reverse(Node node, Node prevNode) {
        if (node.getNext() == null) {
            head = node;
        } else {
            reverse(node.getNext(), node);
        }
        node.setNext(prevNode);
    }

    public void addLast(String value) {
        Node node = new Node(value);

        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
        }
    }

}

class Node {

    private Node next;
    private String value;

    public Node(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return value;
    }
}