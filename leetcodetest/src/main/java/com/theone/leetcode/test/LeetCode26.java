package com.theone.leetcode.test;

public class LeetCode26 {

    /**
     * Definition for a binary tree node.
     * */
  public static class TreeNode {
      int val;
       TreeNode left;
       TreeNode right;
         TreeNode(int x) { val = x; }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }
    }

    static class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            return (A != null && B != null) && (compare(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
        }


        public boolean compare(TreeNode A, TreeNode B) {
            if (B == null) return false;
            if (A == null || A.val != B.val) return false;
            return compare(A.left, B.left) && compare(A.right, B.right);
        }
    }

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3= new TreeNode(3);
        TreeNode t4= new TreeNode(4);
        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        TreeNode s1= new TreeNode(3);

        System.out.println(new Solution().isSubStructure(t1,s1));


    }

}
