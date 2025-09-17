
import java.util.Arrays;

public class fullysortedmatrix{
    public static void main(String[] args) {
        int[][] mat={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }   ;
        // int target =6;
        System.out.println(Arrays.toString(Search(mat, 6)));
    }
    static int[] binarySearch(int[][] mat,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid =cStart+(cEnd-cStart)/2;
            if(mat[row][mid]==target){
                return new int[]{row,col};
            }
            if(mat[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Search(int[][] mat,int target){
        int row= mat.length;
        int col = mat[0].length;
        if(row==1){
            return binarySearch(mat, 0, 0, col-1, target);
        }
        int rStart =0;
        int rEnd =row-1;
        int cMid=col/2;
        // run loop till two rows remaining
        while(rStart<rEnd-1){
            int mid=rStart+(rEnd-rStart)/2;
            if(mat[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(mat[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        
        if(mat[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(mat[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        // search int 1st half
        if(target<=mat[rStart][cMid-1]){
            return binarySearch(mat, rStart, 0, cMid-1, target);
        }
        // 2nd half
        if(target>=mat[rStart][cMid+1] && target<=mat[rStart][col-1]){
            return binarySearch(mat, rStart, cMid+1, col-1, target);
        }
        // 3rd half
        if(target<=mat[rStart+1][cMid-1]){
            return binarySearch(mat, rStart+1, 0, cMid-1, target);
        }else{
            return binarySearch(mat, rStart+1, cMid+1, col-1, target);
        }
        




        // return new int[]{-1,-1};
    }
}