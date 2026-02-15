import java.util.Scanner;
public class removeDupli {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of arr:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of arr: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println("After removing arr: ");
        for(int i=0;i<=j;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
}
