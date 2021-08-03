/* there will be 3 method for coverting array into arraylist
    1.Array.asList()
    2.Collections.addAll()
    3.add()

    here i am using 3rd method to convert array into arraylist....
 */

import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class ArrayToArrayList{
    public static void displayArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int input = scan.nextInt();
        int array [] = new int[input];
        System.out.println("enter the int array elements");
        for(int i=0;i<input;i++){
            int num = scan.nextInt();
            array[i] = num;
        }
        List<Integer> list = new ArrayList<>();
        for(int x : array)
        list.add(x);
        System.out.println("the resultant Arraylist is:");
        System.out.println(list);
        System.out.println("after adding 5");
        list.add(5);
        System.out.println(list);
    }
}