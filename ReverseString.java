import java.util.Scanner;
public class ReverseString{
    public static void stringReverse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the input string");
        String input = scan.next();
        int len = input.length();
        String result ="";
        for(int i=len-1;i>=0;i--){
            result = result+input.charAt(i);
        }
        System.out.println("the reversed String is:");
        System.out.println(result);
    }
}