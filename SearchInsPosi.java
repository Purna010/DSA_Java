public class SearchInsPosi {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int x = 2;
        int l = 0, r = arr.length - 1, ans = arr.length;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] >= x) {
                ans = m;
                r = m - 1;
            } else l = m + 1;   }
        System.out.println(ans);
    }}
