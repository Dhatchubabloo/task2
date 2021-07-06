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
            num.Secondlarge();
            break;

            case 2:
            Arraysof0And1.Array();
            break;

            case 3:
            SortingArray.sort();
            break;

            case 4:
            ReverseString.stringreverse();
            break;

            case 5:
            StringOrder.order();
            break;

            case 6:
            Arraylist.ArrayToArraylist();
            break;

            case 7:
            POJO pop = new POJO();
            pop.setName("dhatchinamoorthi");
            pop.setCompany("zoho corps");
            pop.setSalary(30000);
            pop.setId(17143);
            pop.setAge(21);
            System.out.println(pop);
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
            Rainbow.getValues();
            break;

            case 10:
            FileWriting.newFile();
            break;

        }
    }
}