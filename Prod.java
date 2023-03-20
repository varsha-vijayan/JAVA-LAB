public class Prod
{
int pcde;
String  pnme;
double prce;
Prod(int pcode,String pname,double price)
{
pcde=pcode;
pnme=pname;
prce=price;
}
public static void main(String args[])
{
Prod p1= new Prod(101,"bottle",55.2);
Prod p2= new Prod(102,"book",10.3);
Prod p3= new Prod(103,"box",25.9);
if(p1.prce <p2.prce && p1.prce < p3.prce)
{
System.out.println("Price of bottle is lowest");
}
else if(p2.prce<p1.prce && p2.prce < p3.prce)
{
System.out.println("Price of book is lowest");
}
else if(p3.prce>p2.prce && p3.prce<p1.prce)
{
System.out.println("Price of box is lowest");
}
}
}
