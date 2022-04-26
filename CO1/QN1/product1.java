import java.util.Scanner;

class product1
{
   String pcode;
   String pname;
   int price;
   product1()
   {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the product Number");
	 pcode=scanner.nextLine();
	 System.out.println("Enter the product Name");
	 pname=scanner.nextLine();
	 System.out.println("Enter the product price");
	 price=scanner.nextInt();
	 
   }
   int price()
   {
	   return price;
   }
 
  public static void main(String args[])
  {
	  product1 p1=new product1();
	  int price1=p1.price();
	  
	  product1 p2=new product1();
	  int price2=p2.price();
	  
	  product1 p3=new product1();
	  int price3=p3.price();
	  
	  if(price1<price2 && price1<price3)
	  {
		  System.out.println("price of product 1 is small "+price1);
	  }
	  else if(price2<price3 && price2<price1)
	  {
		  System.out.println("price of product 2 is small "+price2);
	  }
	  else
	  {
		  System.out.println("price of product 3 is small "+price3);
	  }
	  
  }
	
}

