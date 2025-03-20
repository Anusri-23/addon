package DAY1;

public class doublylinkedlist {
	    // Node class representing each node in the doubly linked list
	    static class Node {
	        int data;
	        Node next, prev;

	        // Constructor to create a new node
	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	            this.prev = null;
	        }
	    }

	    Node head;  // Head of the doubly linked list

	    // Method to append a new node to the doubly linked list
	    public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.prev = temp;
	        }
	    }

	    // Method to clone the doubly linked list
	    public doublylinkedlist clone() {
	        doublylinkedlist clonedList = new doublylinkedlist();
	        Node current = head;
	        while (current != null) {
	            clonedList.append(current.data); // Copy each node
	            current = current.next;
	        }
	        return clonedList;
	    }

	    // Method to print the list from head to tail
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	
	    public static void main(String[] args) {
	        // Creating and populating the original doubly linked list
	        doublylinkedlist list = new doublylinkedlist();
	        list.append(1);
	        list.append(2);
	        list.append(3);
	        list.append(4);
	        list.append(5);

	        System.out.println("Original Doubly Linked List:");
	        list.printList();

	        // Cloning the list
	        doublylinkedlist clonedList = list.clone();

	        System.out.println("Cloned Doubly Linked List:");
	        clonedList.printList();
	    }
	}



