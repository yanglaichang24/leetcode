package com.theone.leetcode.test;

public class test2 {


    /**
     * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        return num > 1 ? 1 + (num % 2) + numberOfSteps(num >> 1) : num;
       /* System.out.println(num>>1);
        if(num == 0){
            return 0;
        }
        if(num % 2 == 0){
            return 1+numberOfSteps(num>>1);
        }else{
            return 1+numberOfSteps(num-1);
        }*/

    }


}
