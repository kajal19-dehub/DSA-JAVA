import java.util.Scanner;
public class anagram {
    public static boolean isanagram(String s1, String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        s1.replace(" ","");
        s2.replace(" ","");
        if(s1.length()!=s2.length()){
            return false;
        }

        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s1=sc.nextLine();
        System.out.println("Enetr second string: ");
        String s2=sc.nextLine();
        if(isanagram(s1, s2)){
            System.out.println("String is anagram");
        }else{
            System.out.println("String is not anagram");
        }
    }
}
