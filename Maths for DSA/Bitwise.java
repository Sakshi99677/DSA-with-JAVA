public class Bitwise{
    public static void main(String[] args) {
        EvenOrOdd(21);
        int[] arr = {1,5,3,6,7,3,1,6,5};
        int u = UniqueNumber(arr);
        System.out.println(u);
        int n = 9;
        int i = ithBit(n,3);
        System.out.println(i);




        int m = 6;
        int ans =0;
        int base = 5;
        while(m>0){
            int last = m&1;
            n = n>>1;
            ans +=last*base;
            base = base*5;

        }
        System.out.println(ans);
    }


    static int ithBit(int n,int m ){
        return (n&(1<<m-1));
    }
    static int UniqueNumber(int[] arr){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
    static void EvenOrOdd(int n){
        if((n & 1)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}