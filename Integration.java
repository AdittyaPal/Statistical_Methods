public class Integration
{
  public static final double const1=1.191042759e-16;
  public static final double const2=1.4387752e-2;
  public static final double temp=5000.;
  public static final double a=400.0e-9, b=600.0e-9;
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
    double value=(const1/Math.pow(y,5)*Math.pow(Math.exp(const2/(temp*y))-1,-1));
    return value;
  }
  public static double wTrap(int i,double h)
  {
    if(i==1||i==n)
      return h/2;
    else
      return h;
  }
}
//output= 2331251.8347852184
