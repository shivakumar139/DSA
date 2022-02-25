package String;

final public class Test {
    private int i;
    Test(int i){
        this.i = i;
    }
    public Test modify(int i){
        if(this.i == i){
            return this;
        }
        else{
            return new Test(i);
        }
    }
}



