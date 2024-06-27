//{ Driver Code Starts
import java.util.*;

class Check_IsToepliz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) arr[i][j] = sc.nextInt();
            }

            Solution g = new Solution();
            boolean b = g.isToeplitz(arr);

            if (b == true)
                System.out.println("true");
            else
                System.out.println("false");

            T--;
        }
    }
}
// } Driver Code Ends

class Solution {
    boolean isToeplitz(int mat[][]) {
        // Your code here
        int n=mat.length,m=mat[0].length;

        // moving till n-1 and m-1 because a single corner elements will always be considered as valid diagonal and also to prevent from error: ArrayIndexOutOfBound
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
                if(mat[i][j]!=mat[i+1][j+1])return false;
            }
        }
        
        return true;
    }
}