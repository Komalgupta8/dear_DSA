package dear_DSA.RECURSION;

public class  Parameterised_rec{
    public static void main(String[] args) {
        int n=3;
        int sum=0;
        fn(n , sum);
    }
        
        
    public static void fn(int n , int sum){
            if(n<1){
                System.out.println(sum);
                return;
            }
        fn(n-1, sum+n);
    }
    
}
