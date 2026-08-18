class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;

        long totalSum = (long) n * (n + 1) / 2;

        long arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        return (int)(totalSum - arrSum);
    }
}