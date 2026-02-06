public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};
        int x = 4;
        int l = 0, r = arr.length - 1, ans = arr.length;
   while(l <= r){
            int m = (l + r) / 2;
            if(arr[m] >= x){
                ans = m;
                r = m - 1;
            } else l = m + 1;
        }
        System.out.println(ans);
    }}