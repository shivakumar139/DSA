package Recursion;

public class FirstUpperCase {
    public static void main(String[] args) {
        String str = "sjshdhAhIva";
        System.out.println(firstUpperCase(str));
    }

    public static char firstUpperCase(String str){
        if(str.isEmpty()){
            return '\0';
        }

        if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
            return str.charAt(0);
        }

        return firstUpperCase(str.substring(1));
    }
}
