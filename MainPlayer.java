import java.util.*;
class Venue
{
   String name;
   String city;
   String skill;
   Player(String name,String city,String skill);
   {
   this.name=name;
   this.city=city;
   }
}        

class Main
{
      public static void main(String s[])
      {
      String name,city;
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the name");
      name=sc.nextLine();
      System.out.println("Enter the city");
      city=sc.nextLine();
      venue v=new (name,city,);
      System.out.println("the name is"+v.name);
      System.out.println("the city is" +v.name);
      }
}

