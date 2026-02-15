import java.util.Scanner;
public class checkk{
    public static boolean isosrted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(isosrted(arr)){
            System.out.println("arr is sorted");
        }else{
            System.out.println("arr is not sorted");
        }
    } 
} 
