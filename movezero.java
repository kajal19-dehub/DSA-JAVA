import java.util.Scanner;
public class movezero {
    public static void main(String[] args){
        System.out.println("Enter size of arr: ");
        Scanner sc=new Scanner(System.in);        
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
        }
    }
}
