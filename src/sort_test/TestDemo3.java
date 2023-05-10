package sort_test;

public class TestDemo3 {
    public static void main(String[] args) {
        int number = fun(1);
        System.out.println(number);
    }
    static int fun(int n){
        if(n<0||n>=11)
            return -1;
        if(n==10)
            return 1;
        return (fun(n+1)+1)*2;
    }
}
