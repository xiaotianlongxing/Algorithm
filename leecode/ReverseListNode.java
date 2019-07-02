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
        // ������Ϊ�ջ�ֻ��һ���ڵ㣬ֱ�ӷ���ԭ������
        if (head == null || head.getNext() == null) {
            return head;
        }
        // ǰһ���ڵ�ָ��
        Node preNode = null;
        // ��ǰ�ڵ�ָ��
        Node curNode = head;
        // ��һ���ڵ�ָ��
        Node nextNode = null;

        while (curNode != null) {
            nextNode = curNode.getNext();// nextNode ָ����һ���ڵ�
            curNode.setNext(preNode);// ����ǰ�ڵ�next��ָ��ǰһ���ڵ�
            preNode = curNode;// preNode ָ������ƶ�
            curNode = nextNode;// curNodeָ������ƶ�
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
