public class SkipA{
    public static void main(String[] args) {
        String str = "abbcdaef"; //ans -bbcdef    remove a
        removea("",str);

        String str1 = "abbcdaef"; //ans -bbcdef    remove a
        str1 =removeA(str1);
        System.out.println(str1);
        
    }
    static void removea(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            removea(p,up.substring(1));
        }else{
            removea(p+ch,up.substring(1));
        }
    }

    static String removeA(String up){
        if(up.isEmpty()){
        
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return removeA(up.substring(1));
        }else{
            return ch+removeA(up.substring(1));
        }
    }
}