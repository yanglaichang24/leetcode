package com.theone.leetcode.test;

import java.util.HashMap;
import java.util.Map;

public class LeetCode48 {



    public static int lengthOfLongestSubstring(String s) {
        if(null == s || "".equals(s)) return 0;

        Map<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        int max = 0;
        int l = 0;
        for(int i = 0;i<ch.length;i++){
            Integer index = map.get(ch[i]);
            if(null == index){
                map.put(ch[i],i);
            }else{
                int range = i -  l;
                if(range > max){
                    max = range;
                }
                if(l <= index){
                   l = index + 1;
                }
                map.put(ch[i],i);
            }
        }

        if(ch.length -l > max){
            return ch.length-l;
        }
        return max;

    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }


}
