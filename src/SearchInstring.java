import java.util.Arrays;

public class SearchInstring {
    public static void main(String[] args){
        String str = "Butcher";
        char target = 'k';
//        System.out.println(StrSearch(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search2(String str, char target){
        if(str.length() == target){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target) {
                return true;
            }
        }
        return  false;
    }

    static boolean StrSearch(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
