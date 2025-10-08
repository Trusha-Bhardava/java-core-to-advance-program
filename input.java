import java.util.Scanner;
public class input {
      public static void main(String[] args)
      {
        Scanner myobj=new Scanner(System.in);
        System.out.println("enter your name:");
         String name=myobj.nextLine();
        System.out.println("enter your age:");
        int age=myobj.nextInt();
        System.out.println("enter your salary:");
         double salary=myobj.nextDouble();
       
        System.out.println("name:" + name);
        System.out.println("age:"+ age);
        System.out.println("salary:" + salary);
      }
    
}
