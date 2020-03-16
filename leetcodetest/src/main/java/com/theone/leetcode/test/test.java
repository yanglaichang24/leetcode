package com.theone.leetcode.test;

import java.util.Arrays;

public class test {


    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int[] ints = twoSum(nums, 18);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = nums.length/2;
        int half = nums[i-1];
        if(half <= target){
            for(int j =0;j<i;j++){
                for(int k=j+1;k<i;k++){
                    if(target==nums[j]+nums[k]){
                        result[0]=j;
                        result[1]=k;
                        return result;
                    }
                }
            }
        } else{
            for(int j =i;i<nums.length;j++){
                for(int k=j+1;k<=j;k++){
                    if(target==nums[j]+nums[k]){
                        result[0]=j;
                        result[1]=k;
                        return result;
                    }
                }
            }
        }
        return result;
    }




}
