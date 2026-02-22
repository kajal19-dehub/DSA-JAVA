import java.util.Scanner;
public class removedup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean isDuplicate=false;
            for(int j=0;j<i;j++){
                if(ch==s.charAt(j)){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                result=result+ch;
            }
        }
        System.out.println(result);
    }
}
