import java.util.*;
public class pal{
    public static boolean ispal(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(ispal(s)){
            System.out.println("pal");
        }else{
            System.out.println("Not pal");
        }
    }
}