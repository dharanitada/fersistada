class Venue
{
 string name;
 string city;
venue(string name,string city);
{
this.name=name;
this.city=city;
}
}
class main
public static void main(string s[])
{
string name,city;
scanner sc=new scanner(system.in);
system.out.println("enter the name");
name=sc.nextline();
system.out.println("enter the city");
city=sc.nextline();
venue v=new Venue(name,city);
system.out.println("the name is"+v.name);
system.out.println('the name is"+v.city);
}

