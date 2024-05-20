import java.util.Scanner;

public class printNto1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);

    }

    static void print(int n){
        if (n < 1){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

}
