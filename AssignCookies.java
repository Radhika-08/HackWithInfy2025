import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] s = new int[m];
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
        }
        System.out.println(findContentChildren(g, s));

        sc.close();
    }

    public static int findContentChildren(int[] g, int[] s) {
        int n = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1;
        int j = s.length - 1;

        while (i >= 0 && j >= 0) {
            if (s[j] >= g[i]) {
                n++;
                j--;
            }
            i--;
        }
        return n;
    }

}
