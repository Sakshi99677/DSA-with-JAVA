
// import java.util.ArrayList;

public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {3,67,32,56,56,12,89};
        // Search(arr,56,0);
        System.out.println(Search(arr,56,0));
    }
    static boolean Search(int[] arr,int target,int i){
        if(i==arr.length) return false;
        return arr[i]==target || Search(arr,target,i+1);
    }
    // static int FindIndex(int[] arr,int target,int i){
    //     if(i==arr.length) return -1;
    //     if(arr[i]==target){
    //         return i;
    //     }else{
    //         return FindIndex(arr, target, i+1);
    //     }
    // }




    // static ArrayList<Integer> list = new ArrayList<>();
    // static void FindAllIndex(int[] arr,int target,int i){
    //     if(i==arr.length) return;
    //     if(arr[i]==target){
    //         list.add(i);
    //     }
            // FindAllIndex(arr,target,i+1);
    // }




    //....................return an arraylist
    // static ArrayList<Integer> FindAllIndex(int[] arr,int target,int i,ArrayList<Interger> list){
    //     if(i==arr.length) return list;
    //     if(arr[i]==target){
    //         list.add(i);
    //     }
    //     return findAllIndex(arr,target,i+1,list);
    // }




    // ..............return the list without taking in argument .... create a list in function
 
}