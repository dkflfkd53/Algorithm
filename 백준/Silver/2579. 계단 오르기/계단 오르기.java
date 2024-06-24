import java.util.Scanner;

public class Main {

    static int[] stair = new int[301];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main main = new Main();
        stair[0] = 0;
        for (int i = 1; i <= n; i++) {
            stair[i] = sc.nextInt();
        }
        System.out.println(main.dp(n));
    }

    public static int dp(int n) {
        int[] dpt = new int[n + 3];
        dpt[1] = stair[1];
        dpt[2] = stair[1] + stair[2];
        dpt[3] = (stair[1]>stair[2]) ? stair[3] + stair[1] : stair[3] + stair[2];
        switch (n) {
            case 1:
                return dpt[1];
            case 2:
                return dpt[2];
            case 3:
                return dpt[3];
            default: {
                for (int i = 4; i <= n; i++) {
                    dpt[i] = (stair[i-1] + dpt[i-3] > dpt[i-2]) ? stair[i] + stair[i-1] + dpt[i-3] : stair[i] + dpt[i-2];
                }
                return dpt[n];
            }
        }
    }
}