package dear_DSA.RECURSION;

public class reverse {
    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 1};
        int n = arr.length;
        //single_para_rec(arr, 0);
        multi_para_rec(0, arr, n-1);
        System.out.println(java.util.Arrays.toString(arr)); // Print the array
    }

    // Single parameter recursive approach to reverse the array
    private static void single_para_rec(int[] arr, int i) {
        int n = arr.length;
        if (i >= n / 2) {
            return;
        }
        swap(arr, i, n - i - 1);  
        single_para_rec(arr, i + 1);  
    }


     // Multiple parameter recursion approach to reverse the array
     private static void multi_para_rec(int left, int[] arr, int right) {
        if (left >= right) {
            return;
        }
        
        swap(arr, left, right);
        multi_para_rec(left + 1, arr, right - 1);
    }

    // Helper swap function that actually swaps array elements
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
