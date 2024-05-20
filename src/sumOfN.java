import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        System.out.println(sum(3));
    }

    static int sum(int n){
        if(n <= 1){
            return n;
        }

        return n + sum(n - 1);
    }

}
