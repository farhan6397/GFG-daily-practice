//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
              ArrayList<Integer>ans=new ArrayList<>();
       Map<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<nums.size();i++){
           mp.put(nums.get(i),mp.getOrDefault(nums.get(i),0)+1);
       }
 for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
           if(entry.getValue()>nums.size()/3)ans.add(entry.getKey());
       }
       if(ans.isEmpty()==true) ans.add(-1);
    return ans;
    }
}
