package com.theone.leetcode.test;

import java.util.HashMap;
import java.util.Map;

public class Offer35 {



   static class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
    static class Solution {


        Map<Integer, Node> nodeMap = new HashMap<Integer, Node>();

        int root;

        public Node copyRandomList(Node head) {


            Node pre = new Node(0);
            while (head != null) {
                Node temp = nodeMap.get(head.val);
                if (temp == null) {
                    temp = new Node(head.val);
                    nodeMap.put(head.val, temp);
                    pre.next = temp;
                } else {
                    pre.next = temp;
                }


                Node random = temp.random;
                if (random != null) {
                    Node random_ = nodeMap.get(random.val);
                    if (random_ == null) {
                        nodeMap.put(random.val, new Node(random.val));
                    } else {
                        temp.random = random_;
                    }
                }

                pre = head;
                head = head.next;
            }

            return nodeMap.get(root);

        }


    }

    public static void main(String[] args) {

    }
}
