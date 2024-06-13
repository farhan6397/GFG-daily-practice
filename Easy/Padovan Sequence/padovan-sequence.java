//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java
class Solution {
    // Define the modulo constant as a static final variable for readability
    private static final int MOD = 1000000007;

    public int padovanSequence(int n) {
        // Base cases: P(0) = P(1) = P(2) = 1
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }

        // Initialize the first three values of the Padovan sequence
        int p0 = 1, p1 = 1, p2 = 1;

        // Variable to hold the nth Padovan number
        int pN = 0;

        // Loop to calculate the nth Padovan number using the recurrence relation
        for (int i = 3; i <= n; i++) {
            // Calculate the next Padovan number
            pN = (p0 + p1) % MOD;

            // Update the previous values for the next iteration
            p0 = p1;
            p1 = p2;
            p2 = pN;
        }

        // Return the nth Padovan number
        return pN;
    }
}