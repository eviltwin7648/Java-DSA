package Recursion;

public class SkipAChar {
    public static void main(String[] args) {
        System.out.println(skipsmlStrNotStr("dgapperai"));
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }else {
            skip(p+ch, up.substring(1));
        }
    }
    static String skipStr(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipStr(up.substring(5));
        }else {
         return  up.charAt(0)+ skipStr(up.substring(1));
        }
    }


    static String skipsmlStrNotStr(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipsmlStrNotStr(up.substring(3));
        }else {
            return  up.charAt(0)+ skipsmlStrNotStr(up.substring(1));
        }
    }
}
