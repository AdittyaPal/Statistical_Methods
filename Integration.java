public class Integration
{
  public static final double a=0., b=3.;
  public static final int n=1000;
  public static void main(String args[])
  {
    double sum=0.,h,x,w;
    h=(b-a)/(n-1);
    for(int i=0;i<=n;i++)
    {
      x=a+(i-1)*h;
      w=wTrap(i,h);
      sum+=w*f(x);
    }
    System.out.println(sum);
  }
  public static double f(double y)
  {
    return y*y;
  }
  public static double wTrap(int i,double h)
  {
    if(i==1||i==n)
      return h/2;
    else
      return h;
  }
}
