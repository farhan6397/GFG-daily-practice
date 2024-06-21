//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String s) {

        boolean space = true;
        
        long num = 0;
        long mx = 0;
        
        for(char c: s.toCharArray()){
            int ascii = (int)c;
            
            if(ascii >= 48 && ascii <= 56 && space){
                num = num * 10 + (c - '0');
            }else if(ascii == 57){
                space = false;
                mx = Math.max(num, mx);
                num = 0;
            }else if(ascii == 32){
                mx = Math.max(num, mx);
                space = true;
                num = 0;
            }
        }
        
        mx = Math.max(mx, num);
        
        return mx == 0 ? -1 : mx;
    }
}