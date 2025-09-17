import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args) {
        int[] arr ={4,3,6,3,62,89,33};
        BSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        
    }
    
    
    static void BSort(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            BSort(arr,r,c+1);
        }else{
            BSort(arr,r-1,0);
        }
    }
}