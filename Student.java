import java.util.Scanner;
class mark
{
int m;
int a[];
int sum=0;
float per =0;
Scanner s=new Scanner(System.in);
mark()
{
System.out.print("enter the number of subject:");
m=s.nextInt();
a=new int[m];
}
void operation()
{
System.out.println("\n enter mark of" + m +" subject out of 100:");
for(int i=0;i<m;i++)
{
a[i]=s.nextInt();
sum=sum+a[i];
}
System.out.print("\ntotal marks obtained:"+sum);
per=(sum/m*100)/100;
System.out.println("\npercentage:" +per +"%");
}
}
public class Student
{
public static void main(String args[])
{
mark m=new mark();
m.operation();
}
}
