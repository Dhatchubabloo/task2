import java.util.Scanner;
public class ArraySorter{
    public static void sort(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int number = scan.nextInt();
        int [] display = new int[number];
        System.out.println("enter array values");
        for(int i=0;i<number;i++){
            int token = scan.nextInt();
            display[i] = token;
        }
        int temp=0;
        for(int i=0;i<number;i++){
            for(int j=i+1;j<number;j++){
                if(display[i]>display[j]){
                    temp = display[i];
                    display[i] = display[j];
                    display[j] = temp;
                }
            }
        }
        int result[] = new int[number];
        int value=0;
        for(int i=0,j=number-1;i<=j;i++,j--){
            result[value] = display[j];value++;
            if(value<number)
            result[value] = display[i];value++;
        }
        System.out.println("the resultant array is");
        if(number%2!=0){
            for(int i=0;i<value-1;i++){
                System.out.print(result[i]+" ");
            }
        }
        else{
            for(int i=0;i<value;i++){
                System.out.print(result[i]+" ");
            }
        }
    }
}