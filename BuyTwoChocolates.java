import java.util.*;
public class BuyTwoChocolates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int money = sc.nextInt();
        System.out.println(buyChoco(prices, money));

        sc.close();
    }

    public static int buyChoco(int[] p, int m) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int x : p) {
            if (x < a) {
                b = a;
                a = x;
            } else if (x < b) {
                b = x;
            }
        }

        int total = a + b;
        return total <= m ? m - total : m;
    }
}