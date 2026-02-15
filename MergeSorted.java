import java.util.Scanner;
public class MergeSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr=new int[n1];
        int[] ar2=new int[n2];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            ar2[i]=sc.nextInt();
        }
        int[] merged=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr[i]<ar2[j]){
                merged[k]=arr[i];
                i++;
            }else{
                merged[k]=ar2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            merged[k]=arr[i];
            i++;
            k++;
        }
        while(j<n2){
            merged[k]=ar2[j];
            j++;
            k++;
        }
        for(int x:merged){
            System.out.print(x+" ");
        }
    }
}
