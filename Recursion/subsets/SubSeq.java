import java.util.ArrayList;

public class SubSeq{
    public static void main(String[] args) {
        subString("","Sak");

        String str = "Sak";
        ArrayList<String> s = subString1("",str);
        System.out.println(s);
    }
    

    
    static void subString(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subString(p+ch,up.substring(1));
        subString(p,up.substring(1));
    }

    static ArrayList<String> subString1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subString1(p+ch,up.substring(1));
        ArrayList<String> right = subString1(p,up.substring(1));
        
        left.addAll(right);
        return left;
    }
}