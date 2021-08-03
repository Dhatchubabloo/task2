import java.util.Scanner;
public class StringOrder{
    public static void order(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the String message");
        String line = scan.nextLine();
        String input [] = line.split(" ");
        int len = input.length;
        System.out.println("the reversed message is:");
        for(int i=len-1;i>=0;i--){
            System.out.print(input[i]+" ");
        }
    }
}