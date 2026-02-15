import java.util.Scanner;
public class seclargest {
    public static void main(String[] args){
        int max=0;
        int seclargest=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements of arr: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                seclargest=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>seclargest){
                seclargest=arr[i];
            }
        }
        System.out.println("largest element: "+max);
        System.out.println("Second largest element: "+seclargest);
    }
}
