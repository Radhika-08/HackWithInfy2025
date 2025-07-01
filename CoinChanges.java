import java.util.*;
public class CoinChanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        System.out.println(coinChange(c, a));

        sc.close();
    }

    public static int coinChange (int[] c, int a) {
        int[] m = new int[a + 1];
        Arrays.fill(m, a + 1);
        m[0] = 0;

        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < c.length; j++) {
                if (i - c[j] >= 0) {
                    m[i] = Math.min(m[i], 1 + m[i - c[j]]);
                }
            }
        }

        return m[a] != a + 1 ? m[a] : -1;
    }
}