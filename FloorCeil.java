public class FloorCeil {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8};
        int x = 5;
        int floor = -1, ceil = -1;
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == x) {
                floor = ceil = arr[m];
                break;
            }
            if (arr[m] < x) {
                floor = arr[m];
                l = m + 1;
            } else {
                ceil = arr[m];
                r = m - 1;
            }   }
        System.out.println(floor + " " + ceil);
    }}
