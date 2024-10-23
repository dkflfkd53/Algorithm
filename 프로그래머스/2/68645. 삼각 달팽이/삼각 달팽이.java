class Solution {
    public int[] solution(int n) {
        int[][] array = new int[n][n];
        int c = 1, a = 0, b = 0;
        int[] da = {1, 0, -1};
        int[] db = {0, 1, -1};
        int dir = 0;

        while (c <= n * (n + 1) / 2) {
            array[a][b] = c++;
            int na = a + da[dir];
            int nb = b + db[dir];

            if (na < 0 || na >= n || nb < 0 || nb > na || array[na][nb] != 0) {
                dir = (dir + 1) % 3;
                na = a + da[dir];
                nb = b + db[dir];
            }

            a = na;
            b = nb;
        }

        int[] result = new int[n * (n + 1) / 2];
        
        int index = 0;
        
        for (int x = 0; x < n; x++) {
            for (int y = 0; y <= x; y++) {
                result[index++] = array[x][y];
            }
        }

        return result;
    }
}
