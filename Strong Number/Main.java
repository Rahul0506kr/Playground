#include <stdio.h>
int main() {
	int i,n,p,q,r=1,t,sum=0;
  scanf("%d",&n);
  t=n;
  while(n!=0)
  {
    p=n%10;
    for(i=1;i<=p;i++)
    {
      r=r*i;
    }
    sum=sum+r;
    n=n/10;
    r=1;
  }
  if(t==sum)
  {printf("Yes");
  }
  else{
  printf("No");
  }
	return 0;
}