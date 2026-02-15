import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum is :"+sum);
        int n2=sc.nextInt();
        int sum2=0;
        while(n2>0){
            int digit=n2%10;
            sum2=sum2+digit;
            n2=n2/10;
        }
        System.out.println("sum of digit: "+sum2);
    }
}
