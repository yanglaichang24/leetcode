package com.theone.leetcode.test;

import java.util.Stack;

public class Offer09 {

    static class CQueue {

        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack();
            stack2 = new Stack();
        }

        public void appendTail(int value) {
            stack1.push(value);

        }

        public int deleteHead() {
            if(stack2.empty() && stack1.empty()) return  -1;

            if(stack2.empty()){
                final int size = stack1.size();
                for(int i = 0; i< size; i++){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }


}
