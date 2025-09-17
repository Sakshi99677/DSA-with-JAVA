public class PrimeNumbers{
    public static void main(String[] args) {
        System.out.println(isPrime(45));
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
    }
//false in array means number is prime
    static void sieve(int n,boolean[] primes){
     for(int i =2;i<=n;i++){
         if(!primes[i]){
             for(int j =2*i;j<=n;j+=i){
                 primes[j]=true;
             }
         }
     }
     for(int i = 2;i<=n;i++){
         if(!primes[i]){
            System.out.print(i+" "); 
         }
     }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c =2;
        while(c*c<n){
            if(n/2==0){
                return false;
            }
            c++;
        }
        return true;
    }
}