package com.danielanatolie;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by DanLam on 8/14/16.
 */
public class Node {
    public Integer data;
    public Node next;

    public Node(Integer data) {
        this.data = data;
    }
    public void display() {
        System.out.println(data);
    }
}

class linkedList {
    Node head;

    linkedList() {
        head = null;
    }
    // 2.4
    // Partition a linkedlist around a value x:
    // - nodes < x come before nodes >= x
    // - if x is in the list already, only nodes < than it appear before it
    // - x(s) in this case does not need to be the left/right seperator
    // - ex. In: 3->5->8->5->10->2->1 [partition=5] Out: 3->1>2->10->5->5->8


    // 2.3
    // Delete the first middle node (but not the first nor last), given access to it
    Boolean deleteMiddleNode(Node middleNode) {
        if(middleNode == null || middleNode.next == null) {
            return false
        }
        Node next = middleNode.next;
        middleNode.data = next.data;
        middleNode.next = next.next;
        return true;
    }

    // 2.2 - CONFUSED
    // Find kth to last element in singly linked list
    // OPTION 1:
    int printKthToLast(Node head, int k) {
        if(head==null) {
            return 0;
        }
        int index = printKthToLast(head.next, k) +1;
        if(index==k) {
            System.out.println(k+"th to last node is "+head.data);
        }
        return index;
    }
    // OPTION 2:
    class Index {
        public int value =0;
    }
    Node kthToLast(Node head, int k) {
        Index idx = new Index();
        return kthToLast(head, k, idx);
    }

    Node kthToLast(Node head, int k, Index idx) {
        if(head == null)
            return null;
        Node node = kthToLast(head.next, k, idx);
        idx.value = idx.value +1;
        if(idx.value ==k) {
            return head;
        }
        return node;
    }

    // 2.1
    // Remove duplicates from an unsorted linked list
    public void removeDupsFtHash(Node node) {
        HashSet<Integer> set = new HashSet<Integer>();
        Node previous = null;
        while(node != null) {
            if(set.contains(node.data)) {
                previous.next = node.next;
            } else {
                set.add(node.data);
                previous = node;
            }
            node = node.next;
        }
    }

    public void removeDups(Node head) {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next; // basically removes the curent runner
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

        // Common functions for a linkedList:
        public void display() {
            Node theLink = head;
            while(theLink != null) {
                theLink.display();
                System.out.println("Next Link: "+ theLink.next);
                theLink = theLink.next;
                System.out.println("");
            }
        }
    public void insertFirstLink(Node node) {
        node.next = head;
        head = node;
    }
}