
  Himport java.util.scanner;
class Venue
{    
         String name,city;
         Venue(String na,String ci)
         {
                  this.name=na;
                  this.city=ci;
                  System.out.println("V
enue Details:");
                  System.out.println("Venue name:"+na);
                  System.out.println("City name:"+ci);
          }
}
class Main
{
         public static void Main(string[] args)
          {
                String name,city;
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the Venue name:");
                name=sc.nextLine();
                System.out.println("enter City name:"); 
                city=sc.nextLine();
                Venue v=new Venue(name,city);
           }
}