import java.util.*;
public class charhashing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hash[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(hash[i]>0){
                char c=(char)(i+'a');
                System.out.println(c+"->"+hash[i]);
            }
        }
    }
}
