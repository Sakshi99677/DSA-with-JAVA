public class SortedArray{
    public static void main(String[] args) {
        int[] arr={4,5,6,7,2,8};
        System.out.println(Sorted(arr,0));
    }
    
    static boolean Sorted(int[] arr,int i){
        if(i==arr.length-1) return true;
        
        return arr[i]<arr[i+1] && Sorted(arr,i+1);
    }
}