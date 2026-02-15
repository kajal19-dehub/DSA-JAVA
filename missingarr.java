import java.util.Scanner;
public class missingarr {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        int sum=0;
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum = sum+arr[i];
        }
        int expected=n*(n+1)/2;
        int missing=expected-sum;
        System.out.println("missing element: "+missing);
    }
}
