public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        System.out.println("Welcome to Reverse the arr");
        reverse(arr);
        System.out.println("Array after reverse ");
        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }
    public static void reverse(int[] arr){
        int i = 0;
        while(i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
