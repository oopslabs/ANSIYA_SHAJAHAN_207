package QN2;

import java.util.Scanner;
class Employe
     {
      int empid;
      String name;
      int salary;
      String address;
      Employe()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the empid : ");
         empid=sc.nextInt();
         sc.nextLine();
         System.out.println("Enter the name : ");
         name=sc.nextLine();
         System.out.println("Enter the salary : ");
         salary=sc.nextInt();
         System.out.println("Enter the address : ");
         address=sc.next();
        }
}
class Teachers extends Employe
      {
       String department;
       String subject;
       Teachers()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the department : ");
         department=sc.nextLine();
         System.out.println("enter subject taught : ");
         subject=sc.next();
        }
void display()
       {
        System.out.println("Empid : "+super.empid);
        System.out.println("Name : "+super.name);
        System.out.println("Salary : "+super.salary);
        System.out.println("Address : "+super.address);
        System.out.println("Department : "+department);
        System.out.println("Subject taught : "+subject);
        System.out.println();
       }
}
public class Employee
   {
    public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of Teachers : ");
      int n=sc.nextInt();  
      Teachers obj[]=new Teachers[n];
      for(int i=0;i<n;i++)
        {
          obj[i]=new Teachers();
        }
      for(int i=0;i<n;i++)
        {
          obj[i].display();
        }
   }
 }