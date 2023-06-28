class area
{
 void areac(float r)
{
 float a=3.14f*r*r;
System.out.println("area of circle="+a);
}
 void sphere(float r)
{
 float v=4/3*3.14f*r*r*r;
System.out.println("volume of sphere="+v);
}
void isprime(int n)
{
 int i ;
 for(i=2;i<n;i++)
{
 if(n%2==0)
 break;
}
if(n==i)
System.out.println("prime");
else
System.out.println("notprime");
}
static public void main(String qhg[])
{
  area ob=new area();
  ob.areac(3.4f);
  ob.sphere(6.7f);
  ob.isprime(7);
}
}
  

