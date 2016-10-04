/*implementation of Web Page builder*/

import java.util.Scanner;


public class PageBuilder
{
   public static void main(String[] args)
   {
      String ans;
      
      Scanner cin = new Scanner(System.in);
      
      System.out.println("Web Page Builder started");
      System.out.println("All Rights Reserved (C) 2016");
      System.out.println("enter 'help' to display commands");
      
      ans = cin.readLine();
      while(ans.equals("\n") || ans.length() == 0)
      {}
   }
}