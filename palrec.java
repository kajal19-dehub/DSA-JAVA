import java.util.*;
public class palrec {
    public static boolean pal(String s, int start, int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return pal(s, start+1, end-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(pal(s, 0, s.length()-1)){
            System.out.println("palindrome String");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
