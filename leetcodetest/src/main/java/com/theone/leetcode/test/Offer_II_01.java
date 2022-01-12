package com.theone.leetcode.test;

public class Offer_II_01 {


    public static int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1)
            return Integer.MAX_VALUE;
        int sign = (a > 0) ^ (b > 0) ? -1 : 1;
        if (a > 0) a = -a;
        if (b > 0) b = -b;
        int res = 0;

        //优化：每次尝试减去除数的倍数
        while (a <= b) {
            int value = b;
            int k = 1;
            // 0xc0000000 是十进制 -2^30 的十六进制的表示
            // 判断 value >= 0xc0000000 的原因：保证 value + value 不会溢出
            // 可以这样判断的原因是：0xc0000000 是最小值 -2^31 的一半，
            // 而 a 的值不可能比 -2^31 还要小，所以 value 不可能比 0xc0000000 小
            // -2^31 / 2 = -2^30
            while (value >= 0xc0000000 && a <= value + value) {
                value += value;
                k += k;
            }
            a -= value;
            res += k;
        }
        return sign == 1 ? res : -res;
    }



    public static int divide2(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1)
            return Integer.MAX_VALUE;
        // ab若为一正一负则返回-1
        int sign = (a > 0) ^ (b > 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);
        int res = 0;

        for (int i = 31; i >= 0; i--) {
            // (a >> i) >= b 与 a >= (b << i) 效果相同，但是一个是a右移，相当于做除法，必然不会越界；一个是b左移做乘法，有越界可能
            // 其次，无符号右移的目的是：将 -2147483648 看成 2147483648  [Math.abs(-2147483648) = -2147483648]


            // 注意，这里不能是 (a >>> i) >= b 而应该是 (a >>> i) - b >= 0
            // 这个也是为了避免 b = -2147483648，如果 b = -2147483648
            // 那么 (a >>> i) >= b 永远为 true，但是 (a >>> i) - b >= 0 为 false  [1-Integer.MIN_VALUE < 0]
            if ((a >>> i) - b >= 0) {
                a -= (b << i);
                res += (1 << i);
            }
        }
        return sign == 1 ? res : -res;
    }




    public static void main(String[] args) {
        System.out.println(divide2(100,3));
        System.out.println(16 - (16 >>> 2));
    }
}
