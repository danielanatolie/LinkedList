package com.danielanatolie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Link Bob = new Link("Bob", 3);
        LinkList visitorList = new LinkList();
        visitorList.insertFirstLink("Bob", 3);
        visitorList.insertFirstLink("Daniel", 5);
        visitorList.insertLastLink("David", 4);
        visitorList.display();



    }
}
