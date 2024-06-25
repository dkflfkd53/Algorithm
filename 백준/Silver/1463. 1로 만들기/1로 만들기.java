import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main main = new Main();
        System.out.println(main.dp(n));
    }

    public static int dp(int x) {
        int[] dpt = new int[x + 3];
        dpt[2] =  dpt[3] = 1;
        switch (x) {
            case 2:
                return dpt[2];
            case 3:
                return dpt[3];
            default: {
                for (int i = 4; i <= x; i++) {
                    dpt[i] = dpt[i - 1] + 1; // 기본값: 1을 빼는 경우
                    if (i % 2 == 0) {
                        dpt[i] = Math.min(dpt[i], dpt[i / 2] + 1);
                    }
                    if (i % 3 == 0) {
                        dpt[i] = Math.min(dpt[i], dpt[i / 3] + 1);
                    }
                }
                return dpt[x];
            }
        }
    }
}