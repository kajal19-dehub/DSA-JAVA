import java.util.Scanner;
public class primeno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("not prime");
            return;
        }
        boolean isprime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isprime= false;
                break;
            }
        }
        if(isprime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime");
        }
    }    
}
