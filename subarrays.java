import java.util.*;

public class subarrays {
    static Scanner in = new Scanner(System.in);
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ma_solve();
        hackersolve();
    }

    public static void ma_solve() {
        int l = in.nextInt();
        int s, co = 0;
        int arr[] = new int[l + 10];
        for (int i = 0; i < l; i++) {
            arr[i] = in.nextInt();
        }
        for (int j = 0; j <= l; j++) {
            for (int k = 0; k <= l - j; k++) {
                s = 0;
                for (int i = 0; i < j; i++) {
                    s = s + arr[i + k];
                }
                if (s < 0) {
                    co++;
                }
            }

        }
        System.out.println(co);
    }

    public static void hackersolver() {
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        int numNegativeSubarrays = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }

                if (sum < 0) {
                    numNegativeSubarrays++;
                }
            }
        }

        System.out.println(numNegativeSubarrays);
    }
}
