

public class Fibbonacci{
    public static void main(String[] args) {
        int a = fiboFormula(7);
        System.out.print(a);
        fibo(9);
        
    }
    static int fiboFormula(int n ){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)));
    }

    static int fibo(int n ){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}