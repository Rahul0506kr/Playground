// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int Gcd,a,b,x,y,r;
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
  printf("%d",Gcd);
  
   return 0;
}