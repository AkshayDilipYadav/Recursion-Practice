import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long result = pow(A, B, C);
        System.out.println(result);
    }

    public static long pow (long A, long B, long C){
        if(B == 0){return 1 % C;}
        long half = pow(A, B / 2, C);
        half = (half * half) % C;
        if(B % 2 != 0){half = (half * (A % C)) % C;}
        return (half + C) % C;
    }

}