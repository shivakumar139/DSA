package Recursion;

public class DiceThrow {
    public static void main(String[] args) {
        diceThrow("", 4);
    }
    public static void diceThrow(String p, int up){
        if(up <= 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=up; i++){
            diceThrow(p+i, up-i);
        }
    }
}
