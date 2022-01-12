package com.theone.leetcode.test;

public class leetCode1493 {


    public static int longestSubarray(int[] nums) {
        int max = 0;
        for(int i= 0;i<nums.length;i++){
            int l = -1;
            for(int j= 0;j<nums.length;j++){
                if(j != i && nums[j] == 0){
                    int t;
                    if(i <= l || i>j){
                        t = j - l - 1;
                    } else {
                        t = j - l - 2;
                    }
                    if(t > max){
                        max = t;
                    }
                    l = j;
                }
            }

            int t;
            int lenth = nums.length -1;
            if(i <= l || i>lenth){
                t = lenth - l;
            } else {
                t = lenth - l - 1;
            }
            if(t > max){
                max = t;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1};
        System.out.println(longestSubarray(arr));
    }

}
