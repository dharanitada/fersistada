import java.util.scanner;
class Delivery
{
  Long over,ball,runs;
  String batsman,bowler,nonStriker;
  Delivery(Long over,Long ball,Long runs,String batsman,String bowler,String nonStriker)
 {
    this.over=over;
    this.ball=ball;
    this.runs=runs;
    this.batsman=batsman;
    this.bowler=bowler;
    this.nonStriker=nonStriker;
 }
  void displayDeliveryDetails()
  {
       System.out.println("Delivery Details:");
       System.out.println("Over:"+over);
       System.out.println("ball:"+ball);
       System.out.println("runs:"+runs);
       System.out.println("batsman:"+batsman);
       System.out.println("bowler:"+bowlwer);
       System.out.println("nonStriker:"+nonStriker);
     }
}
Class MainDeliver
{
    public static void main(String[] args)
    {
      Long over,ball,runs;
       String batsman,bowler,nonStriker;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter over:");
       over=sc.nextLong();
       System.out.println("Enter ball:");
       ball=sc.nextLong();
       System.out.println("Enter runs:");
       runs=sc.nextLong();
       sc.nextLine();
       System.out.println("Enter batsman:");
       batsman=sc.nextLine();
       System.out.println("Enter bowler:");
       bowler=sc.nextLine();
       System.out println("Enter nonStriker:");
       nonStriker=sc.nextLine();
       Delivery d=new Delivery(over,ball,runs,batsman,bowler,nonStriker);
       d.displayDeliveryDetails();
   }
}      