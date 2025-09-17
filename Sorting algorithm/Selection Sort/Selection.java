import java.util.Arrays;
public class Selection{
    public static void main(String[] args) {
        int[] arr ={4,3,6,3,62,89,33};
        SSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
        
    }
    
    static void SSort(int[] arr, int r, int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                SSort(arr,r,c+1,c);
            }else{
                SSort(arr,r,c+1,max);
            }
            
            
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1]=temp;
            SSort(arr,r-1,0,0);
        }
    }
}