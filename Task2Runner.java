import java.io.IOException;
import java.util.Scanner;
public class Task2Runner{
    public static void main(String [] args)throws IOException{
       Scanner scan  = new Scanner(System.in);
       System.out.println("enter 1 to 10 to execute the corresponding program");
        int input_num = scan.nextInt();
        switch(input_num){
            case 1:
            SecondLargestNum num = new SecondLargestNum(); 
            num.secondLarge();
            break;

            case 2:
            Array.showArray();
            break;

            case 3:
            ArraySorter.sort();
            break;

            case 4:
            ReverseString.stringReverse();
            break;

            case 5:
            StringOrder.order();
            break;

            case 6:
            ArrayToArrayList.displayArray();
            break;

            case 7:
            PojoClass pojo = new PojoClass();
            pojo.setName("dhatchinamoorthi");
            pojo.setCompany("zoho corps");
            pojo.setSalary(30000);
            pojo.setId(17143);
            pojo.setAge(21);
            System.out.println(pojo);
           break;

            case 8:
            System.out.println("the overloading constructer created successfully");
            OverLoad object1 = new OverLoad(6);
            OverLoad object2 = new OverLoad("hi");
            OverLoad object3 = new OverLoad();
            OverLoad object4 = new OverLoad("hello",2);
            OverLoad object5 = new OverLoad(4,21);
            break;

            case 9:
            Rainbow.showValues();
            break;

            case 10:
            FileWrite.newFile();
            break;

        }
    }
}