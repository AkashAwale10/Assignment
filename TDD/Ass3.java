package tdd;

import java.util.Scanner;

//Write a Junit test where you will enter email and password, and if data is matched with 
//database then test will true, else false. 
public class Ass3 
{
   public static boolean checkString()
   {
	   String mail="abc@gmail.com";
	   String password="abc@123";
	   
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Email");
	   String email=sc.next();
	   System.out.println("Enter password");
	   String pwd=sc.next();
	   
	   if(mail.equals(email) && password.equals(pwd))
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
//   public static void main(String[] args)
//   {
//	   Ass3 obj= new Ass3();
//	   System.out.println(obj.checkString());
//   }
}
