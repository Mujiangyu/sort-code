package sort_test;

public class TestDemo2 {
    public static void main(String[] args) {
        int result = fun(12);
        System.out.println(result);
    }
    static int fun(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        return fun(n-1)+fun(n-2);
    }
}
