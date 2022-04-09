import java.util.Scanner;

public class string_angrams {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the two strings");
        String a = in.next();
        String b = in.next();
        boolean u = isangram(a, b);
        System.out.println(u);
    }

    public static boolean isangram(String a, String b) {
        boolean u = false;
        StringBuilder sa = new StringBuilder(a);
        StringBuilder sb = new StringBuilder(b);
        int x = sa.length();
        int y = sb.length();
        // System.out.println(x + " " + y);
        if (x == y) {
            while (x + y != 0) {
                char c = sa.charAt(0);
                System.out.println(c);
                int fa = 0, fb = 0, i = 0;
                while (i < x) {
                    if (sa.charAt(i) == c) {
                        fa = fa + 1;
                        sa.deleteCharAt(i);
                        // System.out.println("sa = "+sa+" len = "+sa.length());
                    } else {
                        i = i + 1;
                    }
                    x = sa.length();
                }
                i = 0;
                while (i < y) {
                    if (sb.charAt(i) == c) {
                        fb = fb + 1;
                        sb.deleteCharAt(i);
                        // System.out.println("sb = "+sb+" len = "+sb.length());
                    } else {
                        i = i + 1;
                    }
                    y = sb.length();
                }
                if (fa == fb) {
                    u = true;
                    
                } else {
                    u = false;
                    x = 0;
                    y = 0;
                }
            }
        } else
            u = false;
        return u;
    }
}
