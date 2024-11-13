import java.util.*;
import java.io.*;

public class Main {

    static int[] s = new int[1000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            s[i] = sc.nextInt();
        }
        
        System.out.println(dp(n));
    }

    public static int dp(int n) {
        int[] dp = new int[n + 3];
        dp[1] = s[1];
        dp[2] = s[1] + s[2];
        dp[3] = (s[1] > s[2]) ? s[3] + s[1] : s[3] + s[2];
        switch (n) {
            case 1:
                return dp[1];
            case 2:
                return dp[2];
            case 3:
                return dp[3];
            default: {
                for (int i = 4; i <= n; i++) {
                    dp[i] = (s[i-1] + dp[i-3] > dp[i-2]) ? s[i] + s[i-1] + dp[i-3] : s[i] + dp[i-2];
                }
                return dp[n];
            }
        }
    }
}