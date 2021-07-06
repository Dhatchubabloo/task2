import java.util.Scanner;
public class SortingArray{
    public static void sort(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            arr[i] = x;
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int result[] = new int[n];
        int r=0;
        for(int i=0,j=n-1;i<=j;i++,j--){
            result[r] = arr[j];r++;
            if(r<n)
            result[r] = arr[i];r++;
        }
        System.out.println("the resultant array is");
        if(n%2!=0){
            for(int i=0;i<r-1;i++){
                System.out.print(result[i]+" ");
            }
        }
        else{
            for(int i=0;i<r;i++){
                System.out.print(result[i]+" ");
            }
        }
    }
}