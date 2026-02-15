import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements of sorted arr: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        boolean found=false;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.println("elment found at index: "+mid);
                found=true;
                break;
            }
            else if(target>arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(!found){
            System.out.println("Element not found:)");
        }
         
    }
}
