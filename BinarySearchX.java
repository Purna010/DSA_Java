public class BinarySearchX {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int x = 7;
        int l = 0, r = arr.length - 1;

        while(l <= r){
            int m = (l + r) / 2;
            if(arr[m] == x){
                System.out.println(m);
                return;
            }
            if(arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        System.out.println(-1);
    }
}