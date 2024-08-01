import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int result = sumOfDigits(A);
        System.out.println(result);
    }

    public static int sumOfDigits(int A){
        if(A == 0){return 0;}
        return (A % 10) + sumOfDigits(A/10);
    }

}