import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main main = new Main();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            System.out.println(dp(b));
        }
    }

    public static int dp(int b) {
        int[] dpt = new int[b+4];
        dpt[1] = 1;
        dpt[2] = 2;
        dpt[3] = 4;
        switch (b) {
            case 1:
                return dpt[1];
            case 2:
                return dpt[2];
            case 3:
                return dpt[3];
            default:
                for(int i = 4;i<=b;i++) {
                    dpt[i] = dpt[i-1] + dpt[i-2] + dpt[i-3];
                }
                return dpt[b];
        }
    }
}