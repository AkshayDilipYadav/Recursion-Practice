import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        printNumbers(A);
        System.out.println();
    }

    public static void printNumbers(int A){
        if(A < 1){return;}
        System.out.print(A + " ");
        printNumbers(A - 1);
    }
}