//package programs;
import java.util.Scanner;
public class SecondLargestNum{
    public static void Secondlarge(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            arr[i] = x;
        }
        int secondmax = 0;
        for(int j=0;j<2;j++){
            int max = arr[0];
            int index =0;
            for(int i=1;i<n;i++){
                if(arr[i]>max){
                    max = arr[i];
                    index = i;
                }
            }
            secondmax = max;
            arr[index] = -1;
        }
        System.out.println("the second largest element is: "+secondmax);
    }
}