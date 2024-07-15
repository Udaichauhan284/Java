public class MinAndMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Min and Max of Array ");
        int[] arr = {1,2,3,4,5};
        int min = minOfArr(arr);
        int max = maxOfArr(arr);
        System.out.println("The Min " + min + " and" + " max of arr "+ max);
    }
    public static int minOfArr(int[] arr){
        int mini = arr[0];
        int i=0;
        while(i<arr.length){
            if(arr[i] < mini){
                mini = arr[i];
            }
            i++;
        }
        return mini;
    }

    public static int maxOfArr(int[] arr){
        int maxi = arr[0];
        int i = 0;
        while(i < arr.length){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
            i++;
        }
        return maxi;
    }
}
