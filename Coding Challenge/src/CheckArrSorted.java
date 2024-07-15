public class CheckArrSorted {
    public static void main(String[] args){
        int[] arr = {1,2,0,4,5};
        boolean inc = isIncreasing(arr);
        boolean dec = isDecreasing(arr);
        if(inc || dec){
            System.out.println("Soted arr");
        }else{
            System.out.println("Not SOrted arr");
        }
    }
    public static boolean isIncreasing(int[] arr){
        int i=1;
        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] >= arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
