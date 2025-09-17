
import java.util.Arrays;

public class Bubble{
    public static void main(String[] args){
        int[] arr = {8,3,2,5,0,9};
        BSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BSort(int[] arr){
        boolean swapped;
        int n = arr.length;
        //  run steps n-1 time
        for(int i =0;i<n;i++){
            swapped = false;
            // for each step , max item wil come at the last index
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}