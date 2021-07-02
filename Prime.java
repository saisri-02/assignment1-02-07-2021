import java.util.*;
public class Main
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int n,i,j,count=0,s=0;
System.out.println("Enter n value : ");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
s++;
}
}
System.out.println("total= "+s);
}
}