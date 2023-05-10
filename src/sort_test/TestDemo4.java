package sort_test;

public class TestDemo4 {
    public static void main(String[] args) {
        System.out.println(getWay(20));
    }
    static int getWay(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n==3)
            return 4;
        if(n==4)
            return 7;
        return getWay(n-2)+getWay(n-1)+getWay(n-3);
    }
}
