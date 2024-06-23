//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            long n = Long.parseLong(S[0]);
            long q = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.sumMatrix(n, q));
        }
    }
}
// } Driver Code Ends


class Solution {
    static long sumMatrix(long n, long q) {
        // code here
        //To Check Boundary Conditions
        if(q>2*n||q==1) 
        return 0;
        //To Check Middle Point Condition
        if(q==n+1)
        return n;
        if(q<n+1)
        return q-1;
        return 2*n-q+1;
    }
}