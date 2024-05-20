
public class Main {
    public static void main(String[] args) {
        firstrecurion(1);
    }

    static void firstrecurion(int n){
        if(n > 5){
            return;
        }
        System.out.println(n);
        firstrecurion(n+1);
    }


}