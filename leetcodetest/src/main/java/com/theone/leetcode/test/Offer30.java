package com.theone.leetcode.test;

import java.util.Stack;

public class Offer30 {

    static class MinStack {

        Stack<Integer> stack;
        Stack<Integer> min;

        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<Integer>();
            min = new Stack<Integer>();
        }

        public void push(int x) {
            stack.push(x);
            if(!min.empty()){
                int min_v = min.peek();
                if(x <=min_v){
                    min.push(x);
                }
            }else{
                min.push(x);
            }
        }

        public void pop() {
            int value = stack.pop();
            if(value == min.peek()){
                min.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            return min.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.min());
        //System.out.println( minStack.top());
        minStack.pop();
        System.out.println(minStack.min());
    }


}
