import java.util.Arrays;

public class Arraylist{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr ={1,5,4,6,8};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
        


        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // for(int i =0;i<3;i++){
        //     list.add(new ArrayList<>());
 
        // }

        // for (int i =0;i<3;i++){
        //     for(int j =0;j<3;j++){
        //         list.get(i).add(sc.nextInt());
        //     }
        // }

        // System.out.println(list);




        // ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(99);
        // list.add(45);
        // list.add(66);
        // System.out.println(list);

        // System.out.println(list.contains(66));
        // list.set(0,100);
        // list.remove(2);
        // System.out.println(list);
        // for(int i =0;i<5;i++){
        //     list.add(sc.nextInt());
        // }
        // System.out.println(list); 
    }

    static void swap (int[] arr,int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
}





