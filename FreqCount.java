import java.util.Scanner;
class FrequencyCount{
    public static void FreqqCount (int[] arr){
    boolean[] visited = new boolean[arr.length];
    int nonre=0;
    int maxCount=0;
    int minCount=arr.length;
    for(int i=0;i<arr.length;i++){
        if(visited[i]==true){
            continue;
        }
        int count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                visited[j]=true;
            }
        }
        System.out.println(arr[i]  + " occurs " +  count  + " times " );
         if(count>maxCount){
            maxCount=arr[i];
        }
        if(count<minCount){
            minCount=arr[i];
        }
        if(count==1){
            nonre=arr[i];
        }
    }
    System.out.println("Most count : "+maxCount);
    System.out.println("Least count: "+minCount);
    System.out.println("non-repeated: "+nonre);
}
public static void strfreq(String str){
    int[] freq=new int[26];
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch>='a' && ch<='z'){
            freq[ch-'a']++;
        }
    }
    for(int i=0;i<26;i++){
        if(freq[i]>0){
            System.out.println((char)(i+'a')+ " occurs " + freq[i] + " times");
        }
    }
}
    
}

class FreqCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        FrequencyCount.FreqqCount(arr);
        sc.nextLine();

        System.out.println("Enter string: ");
        String str=sc.nextLine();
        FrequencyCount.strfreq(str);
        

        
    }
}
