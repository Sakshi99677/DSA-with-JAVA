import java.util.Scanner;

public class FunctionsEx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Is it a palindrome --> "+ palindrome(a));
        
    }

    static boolean palindrome(int n){
        int rev =0;
        int original = n;
        while(n>0){
            int ld = n%10;
            rev = (rev*10)+ld;
            n = n/10;
        }
        return rev == original;
    }
}