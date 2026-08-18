import java.util.*;

class Solution {
    public int countSubarrays(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int count = 0;

        for(int x : arr){
            while(!st.isEmpty() && st.peek() > x)
                st.pop();
            st.push(x);
            count += st.size();
        }

        return count;
    }
}