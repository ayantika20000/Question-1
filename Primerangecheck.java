import java.util.*;
import java.math.*;
import java.lang.*;
public class Primerangecheck
{
public static void main(String args[])
{
  int n,i,l,u,flag=0;
  l= Integer.parseInt(args[0]);
  u= Integer.parseInt(args[1]);
  for(n=l;n<=u;n++)
  {
  if(n==0||n==1)
   continue;
  flag=0;
  for(i=2;i<=n/2;i++)
  {
   if(n%i==0)
    {
      flag=1;
      break;
    }
  }
 if(flag==0)
  System.out.println(n);
}
}
}