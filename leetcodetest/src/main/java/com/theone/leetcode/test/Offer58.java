package com.theone.leetcode.test;

public class Offer58 {

    public static String reverseLeftWords(String s, int n) {
        char[] ch = s.toCharArray();
        char[] ch_ = new char[ch.length];
        int index = ch.length - n;
        for(int i = 0;i<ch.length;i++){
            if(i < n){
                ch_[index++] = ch[i];
            } else{
                ch_[i-n] = ch[i];
            }
        }
        return new String(ch_,0,ch.length);


    }


    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg",2));
    }


}
