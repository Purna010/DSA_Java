public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int x = 0;
        for(int i : arr)
            x ^= i;
        System.out.println(x);
    }}