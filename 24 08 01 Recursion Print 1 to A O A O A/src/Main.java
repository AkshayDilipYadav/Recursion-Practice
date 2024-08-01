import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        printNumbers(1, A);
        System.out.println();
    }

    public static void printNumbers(int current, int A){
        if(current > A){return;}
        System.out.print(current + " ");
        printNumbers(current + 1, A);
    }
}