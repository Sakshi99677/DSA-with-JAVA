public class CeilingNumber{
    public static void main (String[] args){
        // find the smallest number in the given array that is greater than and equal to the target number
        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        int c = Ceiling(arr,target);
        System.out.println(c);
    }
    static int Ceiling(int[] arr,int t){
        if(t>arr[arr.length-1]) return -1;

        int start =0;
        int end = arr.length-1;
    
        while(start<=end){
            int mid = start+(end-start)/2;
            if(t<arr[mid]){
                end = mid-1;
            }else if(t>arr[mid]){
                start = mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}