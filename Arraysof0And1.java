import java.util.Scanner;
public class Arraysof0And1{
    public static void Array(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements as 0's and 1's");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            arr[i] = x;
        }
        int result[] = new int[n];
        int i=0,j=n-1;
        for(int k=0;k<n;k++){
            if(arr[k]==0){
                result[i] = arr[k];
                i++;
            }
            else{
                result[j] = arr[k];
                j--;
            }
        }
        System.out.println("after the segregation of 0's and 1's");
        for(int a=0;a<n;a++){
            System.out.print(result[a]+" ");
        }
    }
        
}