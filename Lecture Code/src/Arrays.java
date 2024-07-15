public class Arrays {
    public static void main(String[] args) {
        // 1D array
        int[] arr = new int[5];
        //or
        int[] arr1 = {}; //empty array {1,2,3,4,5}, this is how you can enter
        int i=1;
        for(int ind=0; ind<arr.length; ind++){
            arr[ind] = i;
            i++;
        }
        for(int ind=0; ind<arr.length; ind++) {
            System.out.println(arr[ind]);
        }
    }
}
