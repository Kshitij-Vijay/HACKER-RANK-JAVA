/* 
This is a program that just calculates the total frequency of a character in a word.
It then evaluates if the frezuency of each letter is the same. Then only the string is said to be an anagram.
Its a hacker rank problem one cool feature that I may have invented in this program is the double shortening.ie. I increase the charAt insex and also at the same time decrease the length of string. many features and advanteges of this technique are : 
> faster execution
> less space consumption
> complex but with a ton of abstraction
> reusability of the same space
*/

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
