public class hCF{
    public static void main(String[] args) {
        System.out.println(LCM(34,21));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int LCM(int a,int b){
        return a*b/gcd(a,b);
    }
}