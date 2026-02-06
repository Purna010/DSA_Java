public class MaxConsecutive1s {
     public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int c = 0, max = 0;

        for(int x : arr){
            if(x == 1){
                c++;
                if(c > max)
                    max = c;
            } else {
                c = 0;
            }  }
        System.out.println(max);
    }}