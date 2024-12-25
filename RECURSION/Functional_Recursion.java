package dear_DSA.RECURSION;

public class Functional_Recursion {
    public static void main(String[] args) {
        System.out.println(fn(3));
    }

    public static int fn(int n) {
        if(n==0){
            return 0;
        }
        return n+fn(n-1);
    }
}
