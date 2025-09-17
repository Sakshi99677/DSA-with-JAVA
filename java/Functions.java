
// import java.util.Arrays;
import java.util.Scanner;


public class Functions{
    public static void main(String[] args) {
        // int a = 10;
        // int b =20;

        // swap(a, b);
        // System.out.println(a+" "+b);  
        // String name = "Sakshi";   
        // changeName(name);
        // System.out.println(name);
        // fun(4,6,8);
        // fun(20);
        // fun("Sakshi");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean value = armstrong(n);
        System.out.println(value);

    }

    static boolean armstrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n =n/10;
            sum = sum +(rem*rem*rem);
        }

        return sum == original;
    }

    // static boolean isprime(int a){
    
    //     for(int i =2;i<a;i++){
    //         if(a%i==0){
    //             return false;
    //         }
            
    //     }
    //     return true;
    // }
    
    // static void fun(int a){
    //     System.out.println(a);
    // }

    // static void fun(String name){
    //     System.out.println(name);
    // }



    //    static void fun(int ...v){
    //     System.out.println(Arrays.toString(v));
    //    }

    // static void changeName(String name){
    //     name = "Min";
    // }

    // static void swap(int a, int b){
    //     int temp = a;
    //     a =b;
    //     b=temp;
        
    // }
    
    



    // static String greetings(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your name: ");
    //     String name = sc.next();
    //     return "Good Afternoon ! "+name;
    // }


    

    // static int sum(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter first number: ");
    //     int num1= sc.nextInt();
    //     System.out.println("Enter the second number");
    //     int num2=sc.nextInt();
    //     int sum = num1+num2;
    //     return sum;
    // }
}