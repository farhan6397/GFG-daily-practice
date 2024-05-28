//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int w;
            w = Integer.parseInt(br.readLine());

            int[] cost = IntArray.input(br, n);

            Solution obj = new Solution();
            int res = obj.minimumCost(n, w, cost);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int minimumCost(int n, int w, int[] cost) {
        // code here
         HashMap<String,Integer> hs=new HashMap<>();
        int a = solve(n,1,w,cost,hs);
        return (a==80000)?-1:a;
    }
    public static int solve(int n,int i,int w,int arr[],HashMap<String,Integer> hs){
        
        if(w==0)
            return 0;
        if(i-1==arr.length)
            return 80000;
        
        String key=i+"nik"+w;
        if(hs.containsKey(key))
            return hs.get(key);
            
        int a=80000,b=80000;
        if(w-i>=0 && arr[i-1]!=-1)
            a=arr[i-1]+solve(n,i,w-i,arr,hs);
        b=solve(n,i+1,w,arr,hs);
        
        int min = Math.min(a,b);
        hs.put(key,min);
        
        return min;
    }
}

