package com.theone.leetcode.test;

import java.util.HashSet;
import java.util.Set;

public class LeetCode42 {


    public int firstMissingPositive(int[] nums) {
        Set<Integer> t =new HashSet<Integer>();
        for(int i = 0;i< nums.length;i++){
            if(nums[i] > 0){
                t.add(nums[i]);
            }
        }

        for(int i = 1;i < Integer.MAX_VALUE;i++){
            if(!t.contains(i)){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }


}
