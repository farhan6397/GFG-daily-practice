//{ Driver Code Starts
// Initial Template for Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            int[] arr = new int[inputArr.length];
            for (int i = 0; i < inputArr.length; i++) {
                arr[i] = Integer.parseInt(inputArr[i]);
            }

            Solution ob = new Solution();
            long ans = ob.findSmallest(arr);
            System.out.println(ans);
        }
        sc.close();
    }
}

// } Driver Code Ends

class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        int res = 1;
        for(int i=0;i<=arr.length-1;i++){
            //checking the first elemant is less than res
            if(res<arr[0]){
                return res;
            }
            //checking if arr[i] is grater thn res then we cannot add
            if(arr[i]>res){
                break;
            }else{
                // checking the number is present or not if present than add
                res = res + arr[i];
            }
        }
        return res;
    }
}