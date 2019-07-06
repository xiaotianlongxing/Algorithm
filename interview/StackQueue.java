package com.interview;

import java.util.Stack;

/**
 * 用栈实现队列的入和出，时间复杂度都是O(1)
 * @author Administrator
 *
 */
public class StackQueue {

    private Stack<Integer> stackIn = new Stack<Integer>();
    private Stack<Integer> stackOut = new Stack<Integer>();

    public void push(int num) {
        stackIn.push(num);
    }

    public Integer pop() {
        if (stackOut.isEmpty()) {
            if (stackIn.isEmpty()) {
                return null;
            }
            transfer();
        }
        return stackOut.pop();
    }

    public void transfer() {
        while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);
        stackQueue.push(4);
        stackQueue.push(5);
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
        stackQueue.push(6);
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
    }
}
