class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int low = 0;
        int high = k-1;
        
        int sum = 0;
        
        // Calculate the first windoew sum
        
        for(int i = low; i <= high; i++)
        {
            sum = sum + arr[i];
        }
        
        int res = sum;
        
        
        //  Sliding the window
        
        while(high < n-1)
        {
            
             sum = sum - arr[low]; 
            // res = max(res,sum);
            low ++;
            high++;
        // }
        // if(high == n)
        // {
        //     break;
            // sum = sum - arr[low]; 
            // sum = sum - arr[low]; 
            
            sum = sum + arr[high] ; // 300 - 100 + 300
            
            res = Math.max(res,sum);
        }
        return res;
    }
    // return res;
    // return res;
}