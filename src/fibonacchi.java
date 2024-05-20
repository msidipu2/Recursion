import java.util.Scanner;

public class fibonacchi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        int num = fibo(nth);
        System.out.println(num);

    }

    static int fibo(int n){
        if (n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

}
