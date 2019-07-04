package com.interview;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> mainStack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int element) {
        mainStack.push(element);
        if(minStack.empty() || element <= minStack.peek()){
            minStack.push(element);
        }
    }

    public int pop() {
        if(mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        return minStack.pop();
    }

    public int getMin() throws Exception {
        if(mainStack.empty()){
            throw new Exception("stack is empty");
        }
        return minStack.peek();
    }
    
    public static void main(String[] args) throws Exception {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(6);
        minStack.push(1);
        minStack.push(2);
        minStack.push(8);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());
    }
    
}
