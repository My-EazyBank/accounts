package com.easybytes.accounts;

public class Main {
    public static int climbStairsFibonacci(int n) {
        if (n <= 2) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static int climbStairsDynamicProgramming(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; // base case: there is only one way to climb 0 stairs (i.e., not climbing any stairs)
        dp[1] = 1; // base case: there is only one way to climb 1 stair
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // recursive case: climb i stairs by either climbing i-1 stairs and then 1 stair, or by climbing i-2 stairs and then 2 stairs
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Total number of unique ways to climb " + n
                + " stairs: " + climbStairsFibonacci(n));
        System.out.println("Total number of unique ways to climb " + n
                + " stairs: " + climbStairsDynamicProgramming(n));
    }
}
