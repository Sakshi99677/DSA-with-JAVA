public class RotationCount{
    public static void main(String[] args) {
        int[] arr ={13,14,15,16,17,18,2,3,6,12};
        int ans = RCount(arr);
        System.out.println(ans);
    }
    static int RCount(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end -start)/2;
            if(arr[mid]>arr[mid+1] && mid<end){
                return mid+1;
            }
            if(arr[mid]<arr[mid-1] && mid>start){
                return mid-1+1;
            }
            if(arr[start]>arr[mid]){
                end = mid-1;
            }
            if(arr[start]<arr[mid]){
                start=mid;
            }
             if(arr[start]==arr[mid]){
                return 0;
            }
        }
        return -1;
    }
}