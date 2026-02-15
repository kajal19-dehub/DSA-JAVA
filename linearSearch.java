import java.util.Scanner;
class search{
public static int linearsearch(int[] arr, int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return 1;
        }
    }
    return -1;
}
}

class linearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Enetr" + size + "numbers");
        for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
        }

        System.out.println("Enter target: ");
        int target=sc.nextInt();
        int result= search.linearsearch(arr, target);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found");
        }
    }

}
