import java.util.*;
public class revrec {
    public static void rev(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        rev(arr,start+1,end-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        rev(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
