//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.findCoverage(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findCoverage(int[][] matrix) {
        // code here
        
        int row  = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        int left = 0, right = 0, up = 0, buttom = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 1){
                    
                 /*   
                 // First Logic
                 
                    if(j > 0 &&  matrix[i][j-1] == 0){
                        count++;
                    }
                    if(j < col - 1 && matrix[i][j+1] == 0){
                        count++;
                    }
                    
                    if(i > 0 &&  matrix[i-1][j] == 0){
                        count++;
                    }
                    if(i < row - 1 && matrix[i+1][j] == 0){
                        count++;
                    }
            */        
            
            // Secound Logic
            
            /*
                 left += j > 0 &&  matrix[i][j-1] == 0 ? 1 : 0;
                 right += j < col - 1 &&  matrix[i][j+1] == 0 ? 1 : 0;
                 up  += i > 0 &&  matrix[i-1][j] == 0 ? 1 : 0;
                 buttom += i < row-1 && matrix[i+1][j] == 0 ? 1 : 0;
                
            */
            
            // Third Logic
            
                 left = j > 0 &&  matrix[i][j-1] == 0 ? count++ : 0;
                 right = j < col - 1 &&  matrix[i][j+1] == 0 ? count++ : 0;
                 up  = i > 0 &&  matrix[i-1][j] == 0 ? count++ : 0;
                 buttom = i < row-1 && matrix[i+1][j] == 0 ? count++ : 0;
                
            
                
                
                
                
                }
                
             //  count = left + right + up + buttom;
            }
        }
        return count;
    }
}