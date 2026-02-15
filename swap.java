import java.util.Scanner;
class swapp{
    public void swappp(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("swap is a = " + a + " b = "+b);
    }
}
class swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a: ");
        int a=sc.nextInt();
        System.out.println("Enetr b: ");
        int b=sc.nextInt();
        swapp obj=new swapp();
        obj.swappp(a,b);
    }
}
