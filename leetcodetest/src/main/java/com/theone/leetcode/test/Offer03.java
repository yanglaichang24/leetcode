package com.theone.leetcode.test;

import java.util.HashSet;
import java.util.Set;

public class Offer03 {

    public static int findRepeatNumber(int[] nums) {

        Set<Integer> data = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(!data.contains(nums[i])){
                data.add(nums[i]);
            }else{
                return nums[i];
            }
        }
        return 0;




    }



    public static void main(String[] args) {
        int[] arr = {3,4,2,0,0,1};
        System.out.println(findRepeatNumber(arr));
    }
}
