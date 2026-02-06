import java.util.HashMap;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {1,-1,5,-2,3};
        int k = 3, sum = 0, max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum == k)
                max = i + 1;
            if(map.containsKey(sum - k))
                max = Math.max(max, i - map.get(sum - k));
            if(!map.containsKey(sum))
                map.put(sum, i);}
        System.out.println(max);
    }}