import java.util.Scanner;
public class palindromestr {
    public static boolean ispalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(ispalindrome(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
