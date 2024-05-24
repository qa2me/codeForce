import java.util.*;

public class Main {
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int arr[]=new int[n];
        for(int i = 0 ; i < n;i++){
            arr[i]=scan.nextInt();
            
        }
        String build ="";
        int whoo;
        for(int i = 0 ; i < arr.length; i++){
            
            build+=who(arr,i+1)+" ";
            }
        System.out.println(build.trim());
            
        }
    public static int who(int arr[],int is){
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]==is){
                return i+1;
            }
        }
        return -1;
    }
        
}
