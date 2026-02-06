public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,3,9,2,9};
        int max = arr[0], smax = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            } else if(arr[i] < max && arr[i] > smax){
                smax = arr[i];
            } }
        System.out.println(smax);
    }}