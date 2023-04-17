class Rectangle{
double length,breadth ;
public void setData(double l,double b)
{
length=l;
breadth=b;
}
public double getArea(double length,double breadth)
{
double p;
p=length*breadth;
return p;
}
public static void main(String args[]){
Rectangle r=new Rectangle();
double a=r.getArea(12.48,13);
System.out.println("area="+a);
}
}
