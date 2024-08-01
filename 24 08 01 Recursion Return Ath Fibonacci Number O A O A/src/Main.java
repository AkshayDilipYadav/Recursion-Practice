import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int result = fibonacci(A);
        System.out.println(result);
    }

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int A){
        if(A == 0){return 0;}
        if(A == 1){return 1;}
        if(memo.containsKey(A)){return memo.get(A);}
        int result = fibonacci(A - 1) + fibonacci(A - 2);
        memo.put(A, result);
        return result;
    }

}