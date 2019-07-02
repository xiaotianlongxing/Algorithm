package com.leecode;

public class ReverseListNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static Node reverseListNode(Node head) {
        // 单链表为空或只有一个节点，直接返回原单链表
        if (head == null || head.getNext() == null) {
            return head;
        }
        // 前一个节点指针
        Node preNode = null;
        // 当前节点指针
        Node curNode = head;
        // 下一个节点指针
        Node nextNode = null;

        while (curNode != null) {
            nextNode = curNode.getNext();// nextNode 指向下一个节点
            curNode.setNext(preNode);// 将当前节点next域指向前一个节点
            preNode = curNode;// preNode 指针向后移动
            curNode = nextNode;// curNode指针向后移动
        }
        return preNode;
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
        reverseListNode(node1);
        System.out.println(node5.next.data);
    }
}
