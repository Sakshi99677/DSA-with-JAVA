public class FloorNUM{
    public static void main(String[] args) {
        // floor is greatest number that is smaller or equal to target number
        int[] arr = {2,3,5,9,14,15,19};
        int target = 7;
       int f= Floor(arr,target);
       System.out.println(f);
    }
    static int Floor(int[] arr,int t){
        if(t<arr[arr.length-1]) return -1;
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid =start+(end - start)/2;
            if(t<arr[mid]){
                end = mid-1;
            }else if(t>arr[mid]){
                start = mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}