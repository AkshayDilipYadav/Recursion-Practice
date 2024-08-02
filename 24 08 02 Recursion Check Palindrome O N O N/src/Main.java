import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        int result = isPalindrome(A, 0, A.length() - 1);
        System.out.println(result == 1 ? "Yes" : "No");
    }
    public static int isPalindrome(String A, int start, int end){
        if(start >= end){return 1;}
        if(A.charAt(start) != A.charAt(end)){return 0;}
        return isPalindrome(A, start + 1, end - 1);
    }
}