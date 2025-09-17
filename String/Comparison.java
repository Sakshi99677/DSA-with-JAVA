
import java.util.ArrayList;


public class Comparison{
   
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+3);
        System.out.println("Sakshi"+new ArrayList<>());
        System.out.println("Sakshi"+new Integer(56));
        
        System.out.println(new ArrayList<>()+""+new Integer(56));
    }
}