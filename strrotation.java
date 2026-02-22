import java.util.Scanner;
public class strrotation {
    public static boolean isro(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String temp=s1+s2;
        return temp.contains(s2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(isro(s1, s2)){
            System.out.println("rotation");
        }else{
            System.out.println("no rotation");
        }
    }
}
