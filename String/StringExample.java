package String;

public class StringExample {
    public static void main(String[] args) {
        String name = "shiva";

//        System.out.println(name.reverse());

        StringBuilder builder = new StringBuilder(name);
        String b = "" + builder;
        System.out.println(name.equals(b));
//        System.out.println(builder);


//        int index = builder.indexOf(str);
//        System.out.println(index);
//        builder.setCharAt(index,'-');
    }


    static public String freqAlphabets(String s) {

        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i<s.length()){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                String part = s.substring(i,i+2);
                System.out.println(part);
                int a = Integer.parseInt(String.valueOf(part));
                ans.append((char)(a+96));
                i+=3;
            }
            else{
                ans.append((char)(s.charAt(i)+'0'));
                i++;
            }
        }

        return ans.toString();
    }
}
