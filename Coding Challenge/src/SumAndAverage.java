public class SumAndAverage {
    public static void main(String[] args){
        System.out.println("Welcome to Sum and Average of Array ");
        int[] arr = {1,2,3,4,5};
        int sum = sumOfNum(arr);
        System.out.println("The sum of all number : "+ sum);
        float average = averageOfArr(arr);
        System.out.println("The average of number: " + average);
    }
    public static int sumOfNum(int[] arr){
        int sum = 0;
        int i = 0;
        while(i<arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }
    public static int averageOfArr(int[] arr){
        int n = arr.length;
        int sum = sumOfNum(arr);
        return (sum / n);
    }
}
