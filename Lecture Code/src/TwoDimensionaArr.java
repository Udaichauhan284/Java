public class TwoDimensionaArr {
    public static void main(String[] args){
        int[][] arr = new int[3][3]; //3row and 3 col
        //or
        int[][] arr1 = {{1,2,3},{6,5,4}};
        int i = 0;
        while(i < arr1.length){
            int j = 0;
            while(j < arr1[i].length){
                System.out.print(" " + arr1[i][j] + " ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
