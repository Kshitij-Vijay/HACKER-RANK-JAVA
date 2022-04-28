import java.util.HashSet;

public class hashsets {
    public static void main(String[] args) {
        hackkerrank();
    }

    public static void hackkerrank() {
        String[] pair_left = { "jhon", "jhon", "jhon", "mary", "mary" };
        String[] pair_right = { "tom", "mary", "tom", "anna", "anna" };
        
        /*
            https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
        */
        
        HashSet <String> h = new HashSet<>();
        for(int i = 0; i < 5;i++){
            h.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(h.size());
        }

    }

    
}
