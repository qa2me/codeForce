import java.util.*;
 
public class Main {
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int arr[]=new int[n];
        for(int i = 0 ; i < n;i++){
            arr[i]=scan.nextInt();
            
        }
        System.out.println();
        for(int qais :arr){
            System.out.println(min(arr,qais)+" "+max(arr,qais) );
        }
    
    }
    public static int max(int [] arr,int key ){
        
        int place = Arrays.binarySearch(arr, key);
        if(place==0) return Math.abs(key-arr[arr.length-1]);
        if(place==arr.length-1) return Math.abs(key-arr[0]);
        else return Math.max(Math.abs(key-arr[0]), Math.abs(key-arr[arr.length-1]));
        
        
    }
    public static int min(int [] arr,int key ){
        int place=Arrays.binarySearch(arr, key);
        if(place==-1)return 0;
        if(place==arr.length-1){return Math.min(Math.abs(key-arr[0]), Math.abs(key-arr[arr.length-2]));}//last element 
        if(place==0){
            return Math.min(Math.abs(key-arr[arr.length-1]), Math.abs(key-arr[1]));
        }
        int diff=Math.min(Math.abs(key-arr[place+1]), Math.abs(key-arr[place-1]));
        
    return diff;
    }
    
        
}
