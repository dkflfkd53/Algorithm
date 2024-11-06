import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> hm = new HashMap<>();

        int[][] d = new int[100][2];
        d[0][1] = d[1][0] = 0;
        d[0][0] = d[1][1] = 1;

        int T = sc.nextInt();

        for(int i=0;i<T;i++) {
            int N = sc.nextInt();

            if(N==0) {
                System.out.println(d[0][0] + " " + d[0][1]);
            } else if(N==1) {
                System.out.println(d[1][0] + " " + d[1][1]);
            } else {
                for(int j=2;j<=N;j++) {
                    d[j][0] = d[j-1][0] + d[j-2][0];
                    d[j][1] = d[j-1][1] + d[j-2][1];
                }
                System.out.println(d[N][0] + " " + d[N][1]);
            }
        }
    }
}
