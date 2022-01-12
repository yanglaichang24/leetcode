package com.theone.leetcode.test;

public class Offer12 {


    public static boolean exist(char[][] board, String word) {
        char[] ch = word.toCharArray();
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[i].length;j++){
                if(dfs(i,j,board,ch,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(int i,int j,char[][] board,char[] word,int k){
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word[k]) return false;
        board[i][j] = '\n';
        if(k==word.length -1) return true;
        boolean flag
                 = dfs(i,j-1,board,word,k + 1) //左
                || dfs(i-1,j,board,word,k + 1) //上
                || dfs(i,j+1,board,word,k + 1) //右
                || dfs(i+1,j,board,word,k + 1); //下
        board[i][j] = word[k];
        return flag;

    }


    public static void main(String[] args) {
        //char[][] ch = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char[][] ch = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        System.out.println(exist(ch,"AAB"));
    }
}
