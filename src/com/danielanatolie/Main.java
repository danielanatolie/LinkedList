package com.danielanatolie;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Link Bob = new Link("Bob", 3);
//        LinkList visitorList = new LinkList();
//        visitorList.insertFirstLink("Bob", 3);
//        visitorList.insertFirstLink("Daniel", 5);
//        visitorList.insertLastLink("David", 4);
//        visitorList.display();

        linkedList list = new linkedList();
        Node node1 = new Node(131);
        Node node2 = new Node(433);
        Node node3 = new Node(384);
        Node node4 = new Node(341);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        list.head = node1;
        list.insertFirstLink(node4);
        list.insertFirstLink(node3);
        list.insertFirstLink(node2);
        list.insertFirstLink(node1);



    }
}
