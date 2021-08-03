import java.util.Scanner;
public class Array{
    public static void showArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int number = scan.nextInt();
        int [] display = new int[number];
        System.out.println("enter array values as 0's and 1's");
        for(int i=0;i<number;i++){
            int token = scan.nextInt();
            display[i] = token;
        }
        int result[] = new int[number];
        int temp=0,value=number-1;
        for(int k=0;k<number;k++){
            if(display[k]==0){
                result[temp] = display[k];
                temp++;
            }
            else{
                result[value] = display[k];
                value--;
            }
        }
        System.out.println("after the segregation of 0's and 1's");
        for(int a=0;a<number;a++){
            System.out.print(result[a]+" ");
        }
    }
        
}