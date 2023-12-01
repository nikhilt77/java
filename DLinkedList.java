import java.util.*;

public class DLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void deleteNode(Node del) {
        if (head == null || del == null) {
            return;
        }
        if (head == del) {
            head = del.next;
        }
        if (del.next != null) {
            del.next.prev = del.prev;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        return;
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DLinkedList dlList = new DLinkedList();
        int n, data, ndata;
        System.out.println("Enter the number of nodes: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the data for node " + i + ": ");
            data = sc.nextInt();
            dlList.addNode(data);
        }
        dlList.display();
        System.out.println();5
        System.out.println("Enter the data to be deleted: ");
        ndata = sc.nextInt();
        Node del = dlList.head;
        while (del != null) {
            if (del.data == ndata) {
                break;
            }
            del = del.next;
        }
        dlList.deleteNode(del);
        dlList.display();

    }
}
