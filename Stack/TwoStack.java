import java.util.*;

public class TwoStack{
    static int twoStack(int x, int[] a, int[] b){
        return twoStack(x, a, b, 0, 0)-1;
    }
    private static int twoStack(int x, int[] a, int[] b, int sum , int count){
        if(sum>x){
            return count;
        }

        if(a.length==0 && b.length==0){
            return count;
        }

        int ans1 = count, ans2 = count;

        if (a.length > 0) {
            ans1 = twoStack(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        }
        
        if (b.length > 0) {
            ans2 = twoStack(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);
        }

        return Math.max(ans1,ans2);
    }

    public static void main(String[] args) {
        int x = 10;
        int[] a = {4, 2, 3, 1};
        int[] b = {5, 6, 7};
        System.out.println(twoStack(x, a, b)); // Output: 4
    }
}