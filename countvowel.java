import java.util.Scanner;
public class countvowel {
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int vowels=0;
    int consonant=0;
    int spaces=0;
    str=str.toLowerCase();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            vowels++;
        }else if(ch>='a' && ch<='z'){
            consonant++;
        }else if(ch==' ') {
            spaces++;
        }
    }
    System.out.println("vowels: "+vowels);
    System.out.println("consonant: "+consonant);
    System.out.println("spaces: "+spaces);
    }
}
