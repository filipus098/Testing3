public class StringHelper {
    public static String removeSpace(String s){
        return s.replace(" ","");
    }
    public static boolean isCertainLen(String s, int maxLen){
        return s.length()==maxLen;
    }
}
