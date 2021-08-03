//package programs;
import java.util.Scanner;
public class SecondLargestNum{
    public static void secondLarge(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int number = scan.nextInt();
        int [] display = new int[number];
        System.out.println("enter array values");
        for(int i=0;i<number;i++){
            int token = scan.nextInt();
            display[i] = token;
        }
        int secondMax = 0;
        for(int j=0;j<2;j++){
            int max = display[0];
            int index =0;
            for(int i=1;i<number;i++){
                if(display[i]>max){
                    max = display[i];
                    index = i;
                }
            }
            secondMax = max;
            display[index] = -1;
        }
        System.out.println("the second largest element is: "+secondMax);
    }
}