public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,2,7,1};
        int key = 7;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println(i);
                return;}}
        System.out.println(-1);
    }}
