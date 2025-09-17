public class Rectangle {
    public static void main(String[] args) {
        pattern31(4);
        
    }
    static void pattern31(int n ){
        int original = n;
        n = 2*n;
        for(int row =0;row<=n;row++){
            for(int col =0;col<=n;col++){
                // minimum distace from all the four walls
                int up = row;
                int down = n-row;
                int left = col;
                int right = n-col;
                int atEveryIndex=original - Math.min(Math.min(up,down),Math.min(left,right));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int i =1;i<=2*n;i++){
            int col =i>n?2*n-i:i;
            for(int s =1;s<=n-col;s++){
                System.out.print("  ");
            }
            
            for(int c =col;c>=1;c--){
                System.out.print(c+" ");
            }
            for(int c =2;c<=col;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        
    }
    static void pattern30(int n){
        for(int i =1;i<=n;i++){
            for(int s =1;s<=n-i;s++){
                System.out.print(" ");
            }
            
            for(int c =i;c>=1;c--){
                System.out.print(c);
            }
            for(int c =2;c<=i;c++){
                System.out.print(c);
            }
            System.out.println();
        }
        
    }
    
    
    static void pattern28(int n){
        for(int i =0;i<2*n;i++){
            int totalColinRow=i>n?2*n-i:i;
            int noOfSpaces =n-totalColinRow;
            for(int s =0;s<noOfSpaces;s++){
                System.out.print(" ");
            }
            for(int j =0;j<totalColinRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i =1;i<=n-1;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
    static void pattern4(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}