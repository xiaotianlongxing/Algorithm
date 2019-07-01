package com.interview;

public class IsCycle {

    public static boolean cycle(Node head) {
        Node p1 = head;
        Node p2 = head;
        while(p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                return true;
            }
        }
        return false;
    }
    
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(2);
        Node node3 = new Node(8);
        Node node4 = new Node(3);
        Node node5 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node1;
        System.out.println(cycle(node1));
    }
}
