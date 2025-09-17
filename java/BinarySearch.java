public class BinarySearch{
    public static void main(String[] args) {
     int[] arr = {23,29,32,35,45,49,50,57,61,63};
    int target = 57;
    int e = Binarysearch(arr, target);
    System.out.println(e);
    }

    static int Binarysearch(int[] arr,int target){
        int start =0; 
        int end = arr.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}