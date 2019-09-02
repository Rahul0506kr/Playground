#include<stdio.h>
int main()
{
   int Gcd,Lcm,a,b,x,y,r;
  scanf("%d%d",&x,&y);
  a=x;
  b=y;
  while(b!=0)
  {
    r=a%b;
    a=b;
    b=r;
  }
  Gcd=a;
  Lcm=(x*y)/Gcd;
  printf("%d",Lcm);
  return 0;
}