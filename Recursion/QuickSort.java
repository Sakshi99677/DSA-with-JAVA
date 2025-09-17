import java.util.Arrays;

public class QuickSort{
    public static void main(String[] args) {
        int[] arr = {34,21,76,34,78};
        Quick(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    
    static void Quick(int[] arr, int low, int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = arr[m];
        
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            
            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            
        }
        
        //  now pivot at correct place now sort other two
        Quick(arr,low,e);
        Quick(arr,s,hi);
    }
}