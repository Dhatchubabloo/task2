import java.util.Scanner;
public class POJO{
        private String name;
        private String company;
        private int salary;
        private int id;
        private int age;
            public void setName(String name){
                this.name = name;
            }
            public void setCompany(String company){
                this.company = company;
            }
            public void setSalary(int salary){
                this.salary = salary;
            }
            public void setId(int id){
                this.id = id;
            }
            public void setAge(int age){
                this.age = age;
            }
           public String toString(){
               return ("Name : "+name+"\n"+"Company Name : "+company+"\n"+"payscale : "+salary+"\n"+"Identity No : "+id+"\n"+"Age : "+age);
           }
}