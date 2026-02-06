public class LongestSubarraySumKPositive {
     public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1};
        int k = 3, sum = 0, l = 0, max = 0;
        for(int r = 0; r < arr.length; r++){
            sum += arr[r];
            while(sum > k){
                sum -= arr[l];
                l++;
            }
            if(sum == k)
                max = Math.max(max, r - l + 1);}
        System.out.println(max);
    }}