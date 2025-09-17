// import java.util.Arrays;
// import java.util.Scanner;


public class Array{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[2][];
        int[][] arr={
            {2,3,7},
            {4,5}
        };
        
        // System.out.println(Arrays.toString(arr1));
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println("");
        }

        for(int[] arr1: arr){
            for(int j =0;j<arr1.length;j++){
                System.out.println(arr1[j]+" ");
            } 
        }







        // String[] str = new String[5];
        // for (int i = 0; i < str.length; i++) {
        //     str[i]=sc.next();
        // }
        // System.out.println(Arrays.toString(str));
        // int[] arr = new int[5];
        // for(int i = 0;i<arr.length;i++){
        //     System.out.println("Enter element "+(i+1));
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // // for (int i = 0; i < arr.length; i++) {
        // //     System.out.print(arr[i]+" ");
        // // }
        // // for (int num : arr) {
        // //     System.out.print(num+" ");
        // // }



    }
}