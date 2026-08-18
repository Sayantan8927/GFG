class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int curr = 0;
        int max = arr[0];
        
        for(int i = 0;i<arr.length;i++)
        {
            curr = curr + arr[i];
            
            if(curr > max)
            {
                max = curr;
            }
            if(curr < 0)
            {
                curr = 0;
            }
        }
        return max;
    }
}