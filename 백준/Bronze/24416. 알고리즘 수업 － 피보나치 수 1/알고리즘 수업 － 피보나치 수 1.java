

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main main = new Main();
        main.fib2(n); // 예시로 10번째 피보나치 수를 계산
    }

    static int a = 0;

    public void fib2(int n) {
        int b, c;
        fib(n);
        b = a;
        a = 0;
        fibona(n);
        c = a;
        System.out.print(b);
        System.out.print(" ");
        System.out.print(c);
    }
    public int fib(int n) {
        if(n == 1 || n == 2) {
            a++;
            return 1;
        }
            else return (fib(n - 1) + fib(n - 2));
    }

    public int fibona(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;
        for(int i = 3;i<=n;i++) {
            f[i] = f[i-1] + f[i-2];
            a++;
        }
        return f[n];
    }

}