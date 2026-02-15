import java.util.Scanner;
class reverse{
    //reverse int array
    public static void revArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--; 
        }
    }
    //reverse string arr
    public static void revstring(char[] arr2){
        int start=0;
        int end=arr2.length-1;
        while(start<end){
            char temp=arr2[start];
            arr2[start]=arr2[end];
            arr2[end]=temp;
            start++;
            end--;
        }
    }
}

class p3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //array int part
        System.out.println("enter size of arr:");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        reverse.revArr(arr);

        System.out.println("Reversed arr:/br");
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        //array string part
        sc.nextLine();

        System.out.println("enter string ");
        String s=sc.nextLine();
        char[] arr2 =s.toCharArray();
        reverse.revstring(arr2);
        System.out.println("Reversed a string: ");
        System.out.println(new String(arr2));


    }
}