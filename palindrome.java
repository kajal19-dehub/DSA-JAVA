import java.util.Scanner;
class palindromee{
    public static boolean palindrome(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
class palindrome{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        if(palindromee.palindrome(arr)){
            System.out.println("it is palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }
    }
}
