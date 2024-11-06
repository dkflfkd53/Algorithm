import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0;i<T;i++) {
            int N = sc.nextInt();

            long[] d = new long[102];
            d[1] = d[2] = d[3] = 1;
            d[4] = d[5] = 2;

            if(N==1 || N==2 || N==3) {
                System.out.println(1);
            } else if(N==4 || N==5) {
                System.out.println(2);
            } else {
                for(int j=6;j<=N;j++) {
                    d[j] = d[j-1] + d[j-5];
                }
                System.out.println(d[N]);
            }
        }
    }
}
