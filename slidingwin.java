import java.util.*;
public class slidingwin {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arr");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter window size: ");
        int window=sc.nextInt();
        int sum=0;
        for(int i=0;i<window;i++){
            sum=sum+arr[i];
        }
        int max=sum;
        for(int i=1;i<n-window;i++){
            sum=sum-arr[i-1]+arr[i+window-1];
        }
        if(sum>max){
            max=sum;
        }
        System.out.println(max+" ");
    }
}
