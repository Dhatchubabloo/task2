import java.util.Scanner;
public class ReverseString{
    public static void stringreverse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the input string");
        String input = scan.next();
        int len = input.length();
        char a [] = input.toCharArray();
        for(int i=0,j=len-1;i<j;i++,j--){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        String result = new String(a);
        System.out.println("the reversed String is:");
        System.out.println(result);
    }
}