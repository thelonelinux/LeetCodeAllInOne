// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static boolean isPalindrome(int x) {
        Integer integer=x;
        String str= new String(integer.toString());

        if(str.contains("-")){
            return false;
        }
        if(str.length()==1){
            return true;
        }

        for (int i=0 ;i<str.length() ;i++) {
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                //Ok
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));

    }
}