package String;

public class Cipher {
    public static void main(String[] args) {
//        String coded = "VTAOG";
//        System.out.println(decode(coded,54));

//        StringBuilder name = new StringBuilder("shiva");
        String str = new String("shiva");
//        System.out.println(name.capacity());
        String name = "shiva";
        System.out.println(str.equals(name));

    }
    static String decode(String coded, int k){
        k = k%26;
        StringBuilder ans = new StringBuilder();
        char ch;
        for(int i=0; i<coded.length();i++){
            if(coded.charAt(i)-k < 'A'){
                ch = (char) (coded.charAt(i) - k + 26);
                ans.append(ch);
            } else{
                ch = (char)(coded.charAt(i)-k);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
