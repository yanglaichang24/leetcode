package com.theone.leetcode.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Stack;

public class LeetCode97 {

    static class Solution {
        public boolean isInterleave(String s1, String s2, String s3) {
            int n1 = s1.length();
            int n2 = s2.length();
            int n3 = s3.length();
            if(n1 + n2 != n3){
                return false;
            }

            LinkedHashMap<Object, Object> objectObjectLinkedHashMap = new LinkedHashMap<>();
            objectObjectLinkedHashMap.put("1",1);
            objectObjectLinkedHashMap.put("2",2);

            System.out.println(objectObjectLinkedHashMap.keySet().stream().findFirst().isPresent());

            boolean[][] flag = new boolean[n1 + 1][n2 + 1];

            new Stack<>();

            new ArrayList<Integer>().stream().mapToInt(Integer::valueOf).toArray();
            return false;

        }


    }
    public static void main(String[] args) {
        System.out.println(new Solution().isInterleave("aabcc","dbbca","aadbbbaccc"));
    }



}
