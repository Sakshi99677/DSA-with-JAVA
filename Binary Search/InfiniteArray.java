public class InfiniteArray{
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,13,14,15};
        int target = 15;
        
        // int ans = Search(arr,target,start,end);
        int ans= findingrange(arr, target);
        System.out.println(ans);
    }

    static int findingrange(int[] arr, int target){
        int start =0;
        int end=1;
        
        //condition for the target to lie in the range
        if(target > arr[end]){
            int temp  = end+1;
            end = end + (end-start+1)*2;
            start = temp;
        }

        return Search(arr,target,start,end);
    }


    static int Search(int[] arr, int t,int start, int end){
        int ans=0;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(t<arr[mid]){
                end = mid-1;
            }else if(t>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
    
        return ans;
    }
}