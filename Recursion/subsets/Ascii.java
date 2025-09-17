import java.util.ArrayList;

public class Ascii{
    public static void main(String[] args) {
        subAscii("","Sa");

        System.out.println(subAsciiRet("","Sak"));
    }
    
    
    static void subAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
            
        }
        char ch = up.charAt(0);
        subAscii(p+ch,up.substring(1));
        subAscii(p,up.substring(1));
        subAscii(p+(ch+0),up.substring(1));
        
    }

    static ArrayList<String> subAsciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subAsciiRet(p+ch,up.substring(1));
        ArrayList<String> second = subAsciiRet(p,up.substring(1));
        ArrayList<String> third = subAsciiRet(p+(ch+0),up.substring(1));
        
        
        first.addAll(second);
        first.addAll(third);
        return first;
    }


}