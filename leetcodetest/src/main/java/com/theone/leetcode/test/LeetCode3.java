package com.theone.leetcode.test;

import java.util.HashMap;
import java.util.Map;

import static com.theone.leetcode.test.LeetCode3.Solution.lengthOfLongestSubstring;


public class LeetCode3 {


    static class Solution {

        public static int lengthOfLongestSubstring(String s) {

            char[] ch = s.toCharArray();
            int left = 0;
            int right = 0;
            int max = 0;

            Map<Character,Integer> data = new HashMap<>();
            while(right < ch.length){
                Integer index = data.get(ch[right]);
                if(null == index){
                    data.put(ch[right],right);
                    int temp = right + 1 - left;
                    if(temp >  max){
                        max = temp;
                    }
                } else{
                    int temp = right - left;
                    if(temp >  max){
                        max = temp;
                    }

                    for(;left <= index;left++){
                        data.remove(ch[left]);
                    }
                    data.put(ch[right],right);
                }
                right++;
            }
            return max;
        }
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcab"));
    }

}
